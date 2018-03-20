import javax.swing.JFrame;

public class Frame extends JFrame {

	private static final long serialVersionUID = 1L;
	Control control = new Control();
	//peter
	//Constructor
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
		addKeyListener(control);
		Panel panel = new Panel();
		Bird bird = new Bird();
		Pipe pipe = new Pipe();
		//Leon
		
		add(panel);
		setVisible(true);
	}

}




