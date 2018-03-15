import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	Control control = new Control();
	//peter
	Image img;
	public Frame() {
		initFrame();
		pan();
		
	}
	private void initFrame() {
		setTitle(Konst.TITLE);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(Konst.WIDTH, Konst.HEIGHT);
		setResizable(false);
		
		
	}
	private void pan() {
		Panel panel = new Panel();
		Bird bird = new Bird();
		Pipe pipe = new Pipe();
		//Leon
		addKeyListener(control);

		//panel.setBackground(Color.red);
		

		add(panel);
		//Leon
		setVisible(true);

		

	}

}



