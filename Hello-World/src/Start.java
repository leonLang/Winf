import java.awt.Font;
import java.awt.Graphics;

public class Start {
	public static void start(Graphics g) {
		Font font = new Font("Arial", Font.BOLD, 16);
		g.setFont(font);
		if(Konst.run == false) {

		g.drawString("Press space to start",Konst.WIDTH/2,Konst.HEIGHT/2);
		}
	}
}
