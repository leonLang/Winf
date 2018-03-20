import java.awt.Font;
import java.awt.Graphics;

public class Start {
	//peter
	public static void start(Graphics g) {
		Font font = new Font("Arial", Font.BOLD, 16);
		g.setFont(font);
		if(Konst.run == false) {

		g.drawString("Press space to exitt",Konst.WIDTH/2,Konst.HEIGHT/2);
		}
	}
}
