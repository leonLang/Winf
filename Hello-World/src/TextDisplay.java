import java.awt.Component;

import javax.swing.JLabel;

public class TextDisplay extends JLabel{
	//peter
	public TextDisplay(int x, int y,String title) {
		setLocation(x,y);
		setText(title);
	}
}
