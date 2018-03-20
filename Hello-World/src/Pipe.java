import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Pipe {
	//Leon
	public static int x1 = 700;
	public static int x2 = 1000;
	public static int x3 = 1300;
	
	public static int y1 = -100;
	public static int y2 = 700;
	public static int y3 = -100;
	public static int y4 = 700;
	public static int y5 = -100;
	public static int y6 = 700;

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
	
	public static void paintP(Graphics g,int x1,int y1, int y2) {
		g.drawImage(pipe1, x1,y1,100,500, null);
		g.drawImage(pipe2, x1,y2,100,500, null);	
	}
	
	public static void generate(Graphics g) {
		if (x1<-100){
			x1=800;
		}
		if (x2<-100){
			x2=800;
		}
		if (x3<-100){
			x3=800;
		}
		x1 = x1-1;
		x2 = x2-1;
		x3 = x3-1;

		paintP(g, x1, y1,y2);
		paintP(g, x2, y3,y4);
		paintP(g, x3, y5,y6);
	}
	
}
