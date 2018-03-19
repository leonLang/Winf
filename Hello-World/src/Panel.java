import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel {

	private static final long serialVersionUID = 1L;
	private BufferedImage image;


	//Leon
	public Panel() {
		try {
		image = ImageIO.read(getClass().getResourceAsStream(Konst.bird));
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		repaint();

	     g.drawImage(image, 0,0,Konst.HEIGHT,Konst.WIDTH, null);
	     Bird.paint(g);
	     Pipe.paintP(g);

	}

 
}

