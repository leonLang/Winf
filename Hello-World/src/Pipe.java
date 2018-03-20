import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pipe {
	//Leon
	public static int x = 700;
	public static int x1 = 1000;
	public static int x2 = 1300;


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
	
	public static void paintP(Graphics g) {
		x = x-1;
		x1 = x1-1;
		x2 = x2-1;

		g.drawImage(pipe1, x,-100,100,500, null);
		g.drawImage(pipe2, x,600,100,500, null);
		g.drawImage(pipe1, x1,-100,100,500, null);
		g.drawImage(pipe2, x1,600,100,500, null);
		g.drawImage(pipe1, x2,-100,100,500, null);
		g.drawImage(pipe2, x2,600,100,500, null);
		
	}
}
