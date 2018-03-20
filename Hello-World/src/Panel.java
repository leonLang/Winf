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
	
		
		setLayout(null);
		try {
		image = ImageIO.read(getClass().getResourceAsStream(Konst.bird));
		
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		try {
			Thread.sleep(16);		
			repaint();	
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     g.drawImage(image, 0,0,Konst.HEIGHT,Konst.WIDTH, null);
	     TextDisplay.font(g);
	     Bird.paint(g);
	     Pipe.generate(g);
	     Collision.collision();
	     Start.start(g);


	}
}

