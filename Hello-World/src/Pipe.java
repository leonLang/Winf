import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pipe {
	//Leon
	public static int x = 700;
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

		g.drawImage(pipe1, 1000,900,100,100, null);
		g.drawImage(pipe2, x,700,100,100, null);
	}
}
