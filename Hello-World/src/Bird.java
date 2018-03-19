
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Bird {

	//peter
	public Bird() {
		
	}
	public static void move() {
		Konst.v = 0;
		Konst.v -= 50;
		System.out.println(Konst.BirdY);

	}
	public static void physiks() {
		Konst.v += Konst.a;
		Konst.BirdY += Konst.v;
		System.out.println(Konst.v);
	}
	public static void paint(Graphics g) {
		Rectangle r = new Rectangle(Konst.BirdX, Konst.BirdY, 20, 20);
		physiks();
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(r);
	}

	
}
