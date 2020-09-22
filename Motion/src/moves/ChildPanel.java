package moves;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class ChildPanel extends JPanel implements MouseListener, MouseMotionListener {

	private static final long serialVersionUID = 1L;
	
	public ChildPanel() {
		addMouseMotionListener(this);
		addMouseListener(this);
	}
	
	public void mouseDragged(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		Graphics pen = getGraphics();
		pen.setColor(Color.BLACK);
		pen.drawRect(x, y, 50, 50);
	}
	
	public void mouseMoved(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		Graphics pen = getGraphics();
		pen.setColor(Color.RED);
		pen.drawOval(x, y, 50, 50);
	}
	
	public void mousePressed(MouseEvent event) {
		int x = event.getX();
		int y = event.getY();
		Graphics pen = getGraphics();
		pen.setColor(Color.YELLOW);
		pen.drawRect(x, y, 100, 100);
	}
	
	public void mouseEntered(MouseEvent event) {
		setBackground(Color.WHITE);
	}
	
	public void mouseExited(MouseEvent event) {
		setBackground(Color.CYAN);
	}
	
	public void mouseClicked(MouseEvent event) { }
	
	public void mouseReleased(MouseEvent event) { }
	
	
	public static void main(String[] args) {
		
	}

}
