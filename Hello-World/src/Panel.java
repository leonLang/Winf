import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{
	 private BufferedImage image;

	//Leon
	public Panel() {
		try {
		image = ImageIO.read(getClass().getResourceAsStream("bg.png"));
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	     g.fillRect(100,100,150,250);
	     g.drawImage(image, 100, 100,1000,1000, null);
	}
 
}
