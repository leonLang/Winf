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
		KeyP key = new KeyP();
		setTitle(Konst.TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Konst.WIDTH, Konst.HEIGHT);
		setResizable(false);
		addKeyListener(key);

		
	}
	private void pan() {
		Panel panel = new Panel();
		Bird bird = new Bird();
		Pipe pipe = new Pipe();
		//Leon

		//panel.setBackground(Color.red);
		

		add(panel);
		//Leon
		setVisible(true);

		

	}
}



