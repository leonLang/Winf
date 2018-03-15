import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import javax.swing.ImageIcon;
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
		//Leon

		panel.setBackground(Color.red);
		
		
		add(panel);
	}
private void initBoard() {
	Image img = null;
        
        loadImage();
        
        int w = img.getWidth(this);
        int h =  img.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
private void loadImage() {
    
    ImageIcon ii = new ImageIcon("bg1.png");
    img = ii.getImage();        
}
}
