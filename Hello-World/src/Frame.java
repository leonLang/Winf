import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
	//peter
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
		JPanel panel = new JPanel();
		
		panel.setBackground(Color.red);
		
		
		add(panel);
	}

}
