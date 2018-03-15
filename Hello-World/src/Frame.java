import java.awt.Image;
import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	//peter
	Image img;
	public Frame() {
		initFrame();
		pan();
		
	}
	private void initFrame() {
		setTitle(Konst.TITLE);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Konst.WIDTH, Konst.HEIGHT);
		
		
		
	}
	private void pan() {
		Panel panel = new Panel();
		Bird bird = new Bird();
		//Leon

		//panel.setBackground(Color.red);


		add(panel);

		

	}
}



