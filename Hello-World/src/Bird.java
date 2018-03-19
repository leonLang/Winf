
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Bird {

	//peter
	public Bird() {
		
	}
	public static void move() {
		Konst.BirdY += 20;
		System.out.println(Konst.BirdY);

	}
	public static void paint(Graphics g) {
		Rectangle r = new Rectangle(Konst.BirdX, Konst.BirdY, 20, 20);
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(r);
	}

	
}
