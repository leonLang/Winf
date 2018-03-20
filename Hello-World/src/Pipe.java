import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pipe {
	//Leon
	public static int x = 700;
	public static int x1 = 1000;
	public static int x2 = 1300;
	public static int y = 100;
	public static int y1 = 100;
	public static int y2 = 100;

	private static BufferedImage pipe1;
	private static BufferedImage pipe2;
	public Pipe() {
		try {
			pipe1 = ImageIO.read(getClass().getResourceAsStream(Konst.pipeO));
			pipe2 = ImageIO.read(getClass().getResourceAsStream(Konst.pipeU));
			} catch(IOException e) {
				e.printStackTrace();
			}
		}
	
	public static void paintP(Graphics g,int x,int y) {
		g.drawImage(pipe1, x,y,100,500, null);
		g.drawImage(pipe2, x,y,100,500, null);	
	}
	
	public static void generate(Graphics g) {
		x = x-1;
		paintP(g, x, y);
		paintP(g, x1, y1);
		paintP(g, x2, y2);
	}
	
}
