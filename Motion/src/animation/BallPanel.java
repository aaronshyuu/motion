package animation;
import javax.swing.JPanel;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;


public class BallPanel extends JPanel implements ActionListener, MouseListener, KeyListener{

	private static final long serialVersionUID = 1L;
	
	private Timer timer;
	private int delay = 5;
	private double delta = 2.0;
	private double x = 0, y = 0;
	private double dx = delta, dy = delta;
	private double radius = 40.0;
	
	public BallPanel() {
		timer = new Timer(delay, this);
		timer.addActionListener(this);
		addKeyListener(this);
		addMouseListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
		timer.start();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2D = (Graphics2D) g;
		g2D.setColor(Color.BLUE);
		Ellipse2D ball = new Ellipse2D.Double(x, y, radius, radius);
		g2D.fill(ball);
	}
	
	public void actionPerformed(ActionEvent event) {
		move();
		repaint();
	}
	
	public void move() { 
	    
		if(x + dx < 0 || x + 2 * radius + dx > getWidth()) {
            dx = -1 * dx;
	    }
		if(y + dy < 0 || y + 2 * radius + dy > getHeight()) {
            dy = -1 * dy;
	    }
		x = x + dx;
	    y = y + dy;
	    
	}
	
	public void mousePressed(MouseEvent event) {
		timer.stop();
	}
	
	public void mouseReleased(MouseEvent event) {
		timer.restart();
	}
	
	public void mouseEntered(MouseEvent event) { }
	public void mouseExited(MouseEvent event) { }
	public void mouseClicked(MouseEvent event) { }
	
	public void keyPressed(KeyEvent event) {
		int key = event.getKeyCode();
		
		if (key == KeyEvent.VK_UP) {
			up();
		} else if (key == KeyEvent.VK_DOWN) {
			down();
		} else if (key == KeyEvent.VK_LEFT) {
			left();
		} else if (key == KeyEvent.VK_RIGHT) {
			right();
		} else if (key == KeyEvent.VK_TAB) {
			increase();
		} else if (key == KeyEvent.VK_SHIFT) {
			 decrease();
		} else if (key == KeyEvent.VK_CONTROL) {
			 plane();
		}
		repaint();
	}
	
	public void up() {
		dx = 0;
		dy = -delta;
	}
	
	public void down() {
		dx = 0;
		dy = delta;
	}
	
	public void left() {
		dx = -delta;
		dy = 0;
	}
	
	public void right() {
		dx = delta;
		dy = 0;
	}
	
	public void increase() {
		dx = dx * 2;
		dy = dy * 2;
	}
	
	public void decrease() {
		dx = dx / 2;
		dy = dy / 2;
	}
	
	public void plane() {
		dx = delta;
		dy = delta;
	}
	
	public void keyTyped(KeyEvent event) { }
	
	public void keyReleased(KeyEvent event) { }
	
	public static void main(String[] args) {

	}

}
