import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;


import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Panel extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private BufferedImage image;
	Timer t = new Timer(1,this);

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

	     g.drawImage(image, 0,0,Konst.HEIGHT,Konst.WIDTH, null);
	     System.out.println("ja");

	     Bird.paint(g);

	     Pipe.paintP(g);
	     t.start();
	}
	public void ActionPerformed(ActionEvent e) {
		repaint();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
 
}

