import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame {
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
		JPanel panel = new JPanel();
		//Leon

		panel.setBackground(Color.red);
		initBoard();

		add(panel);

		

	}
private void initBoard() {
        
        loadImage();
        
        int w = img.getWidth(this);
        int h =  img.getHeight(this);
        setPreferredSize(new Dimension(w, h));        
    }
private void loadImage() {
    
    ImageIcon ii = new ImageIcon("bg.png");
    img = ii.getImage();        
}

public void paintComponent(Graphics g) {

    g.drawImage(img, 0, 0, null);
}
}


