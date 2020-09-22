package animation;
import javax.swing.JFrame;

public class Display {

	public static final int WIDTH = 600;
	public static final int HEIGHT = 400;
	public static final int LEFT_X = 750;
	public static final int TOP_Y = 100;
	
	public Display() {
		BallPanel panel = new BallPanel();
		JFrame frame = new JFrame("Ball Display");
		frame.add(panel);
		frame.setSize(WIDTH, HEIGHT);
		frame.setLocation(LEFT_X, TOP_Y);;
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new Display();

	}

}
