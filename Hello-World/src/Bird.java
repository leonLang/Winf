
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Bird {
	public static BufferedImage BD;//BirdUp
	public static BufferedImage BU;//BirdDown
	public static BufferedImage BL;//BirdLive
	//peter
	public Bird() {
		try {
			BD = ImageIO.read(getClass().getResourceAsStream(Konst.BirdDown));
			BU = ImageIO.read(getClass().getResourceAsStream(Konst.BirdUp));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void move() {
		if(Konst.BirdY >= 0) {
		Konst.v = 0;
		Konst.v -= 10;
		System.out.println(Konst.BirdY);
		} else {
			System.out.println("can t go higher");
		}

	}
	public static void physiks() {
		//Integer i = (int) Konst.v;
		Konst.v += Konst.a;
		Konst.BirdY += Konst.v;
		System.out.println(Konst.v);
		if(Konst.BirdY >= Konst.HEIGHT) {
			Konst.run = false;
		}
	}
	public static void BirdG() {
		if(Konst.v <= 0) {
			BL = BD;
		} else {
			BL = BU;
		}
	}
	public static void paint(Graphics g) {
		Rectangle r = new Rectangle(Konst.BirdX, Konst.BirdY, 20, 20);
		physiks();
		BirdG();
		
		g.drawImage(BL, Konst.BirdX, Konst.BirdY, 50, 50, null);
		
	}

	
}
