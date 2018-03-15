import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.IIOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
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
		add(panel);
		//panel.setBackground(Color.red);
		initBoard();
		

		

	}
private void initBoard() {
        
        loadImage();
        
        int w = img.getWidth(this);
        int h =  img.getHeight(this);
        setPreferredSize(new Dimension(w, h));      
    	JLabel labelb = new JLabel(new ImageIcon(img1));
    }
private void loadImage() {
	try {
    
 BufferedImage img1 = ImageIO.read(new File("bg1.png")); 
	panel.add(labelb);
	} catch (IOException e) {
		System.out.println("Fehler Beim Laden des Bildes");
		}
	}

}


