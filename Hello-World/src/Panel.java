import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;

	//Leon
	public Panel() {
		try {
		image = ImageIO.read(getClass().getResourceAsStream("/bg.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
		repaint();
	}

	public void paintComponent(Graphics g) {

	     g.drawImage(image, 0,0,Konst.HEIGHT,Konst.WIDTH, null);
	     System.out.println("ja");
	     Bird.paint12(g);
	     Pipe.paintP(g);
	}
 
}
