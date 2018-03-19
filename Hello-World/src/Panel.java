import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.JPanel;

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
		try {
			Thread.sleep(10);
			repaint();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	     g.drawImage(image, 0,0,Konst.HEIGHT,Konst.WIDTH, null);
	     Bird.paint(g);
	     Pipe.paintP(g);

	}

 
}

