
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Bird {

	//peter
	public Bird() {
		
	}
	public static void paint(Graphics g) {
		
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fillRect(Konst.BirdX, Konst.BirdY, 20, 20);
	}

	public static void move() {
		Konst.BirdY += 20;
		System.out.println(Konst.BirdY);
		.
	}
	
}
