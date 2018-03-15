import javax.swing.JFrame;

public class Frame extends JFrame {
	//peter
	public Frame() {
		initFrame();
		
	}
	private void initFrame() {
		setTitle("flappy");
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(200, 200);
		
	}
}
