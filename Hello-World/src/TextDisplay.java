import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JLabel;

public class TextDisplay extends JLabel{
		//Leon
	public static void font(Graphics g) {
		Font font = new Font("Serif", Font.BOLD, 16);
		g.setFont(font);
	     g.drawString("Score:", 700, 30);
	     
	}
}
