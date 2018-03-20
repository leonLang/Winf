
import java.awt.Font;
import java.awt.Graphics;



public class TextDisplay {
		//Leon
	public static void font(Graphics g) {
		score();
		Font font = new Font("Serif", Font.BOLD, 16);
		g.setFont(font);
	     g.drawString("Score:" + Konst.score, 700, 30);
	     
	}
	public static void score(){
		if(Konst.x1<400 && Konst.x1>398) {
			Konst.score = Konst.score +1;
		}
		if(Konst.x2<400 && Konst.x2>398) {
			Konst.score = Konst.score +1;
		}
		if(Konst.x3<400 && Konst.x3>398) {
			Konst.score = Konst.score +1;
		}
	}
}
