
import java.awt.Font;
import java.awt.Graphics;



public class TextDisplay {
		//Leon
	public static void font(Graphics g) {
		Font font = new Font("Serif", Font.BOLD, 16);
		g.setFont(font);
	     g.drawString("Score:" + Konst.score, 700, 30);
	     
	}
	public static void score(){
		
	}
}
