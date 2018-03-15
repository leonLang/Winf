import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	//Leon
	public Panel() {
	
	}
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	     g.fillRect(100,100,150,250);
	}
}
