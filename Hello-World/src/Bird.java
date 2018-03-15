
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bird {

	//peter
	public Bird() {
		
	}
	public static void paint(Graphics g) {
		
		final int BirdX = Konst.HEIGHT/2; 
		int BirdY = Konst.WIDTH/2;
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fillRect(BirdX, BirdY, 20, 20);
	}

}
