
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bird {

	private static final long serialVersionUID = 1L;

	//peter
	public Bird() {
		
	}
	public static void paint12(Graphics g) {
		
		final int BirdX = Konst.HEIGHT/2; 
		int BirdY = Konst.WIDTH/2;
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fillRect(BirdX, BirdY, 20, 20);
	}

}
