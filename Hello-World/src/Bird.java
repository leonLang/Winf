
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Bird {

	//peter
	public Bird() {
		
	}
	public static void move() {
		if(Konst.BirdY >= 0) {
		Konst.v = 0;
		Konst.v -= 15;
		System.out.println(Konst.BirdY);
		} else {
			System.out.println("can t go higher");
		}

	}
	public static void physiks() {
		Integer i = (int) Konst.v;
		Konst.v += Konst.a;
		Konst.BirdY += Konst.v;
		System.out.println(Konst.v);
		if(Konst.BirdY >= Konst.HEIGHT) {
			Konst.run = false;
		}
	}
	public static void paint(Graphics g) {
		Rectangle r = new Rectangle(Konst.BirdX, Konst.BirdY, 20, 20);
		physiks();
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fill(r);
	}

	
}
