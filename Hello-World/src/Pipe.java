import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;

public class Pipe {
	//Leon


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
		if (Konst.x1<-100){
			Konst.x1=800;
			Konst.y1 = ThreadLocalRandom.current().nextInt(Konst.rnd1, Konst.rnd2);
			Konst.y2 = Konst.y1+Konst.pAb;
		}
		if (Konst.x2<-100){
			Konst.x2=800;
			Konst.y3 = ThreadLocalRandom.current().nextInt(Konst.rnd1, Konst.rnd2);
			Konst.y4 = Konst.y3+Konst.pAb;
		}
		if (Konst.x3<-100){
			Konst.x3=800;
			Konst.y5 = ThreadLocalRandom.current().nextInt(Konst.rnd1, Konst.rnd2);
			Konst.y6 = Konst.y5+Konst.pAb;
		}
		while(Konst.run) {
		Konst.x1 = Konst.x1-1;
		Konst.x2 = Konst.x2-1;
		Konst.x3 = Konst.x3-1;
		}
		paintP(g, Konst.x1, Konst.y1,Konst.y2);
		paintP(g, Konst.x2, Konst.y3,Konst.y4);
		paintP(g, Konst.x3, Konst.y5,Konst.y6);
		}
	
}
