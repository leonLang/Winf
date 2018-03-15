
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JPanel;

public class Bird extends JPanel implements KeyListener {

	private static final long serialVersionUID = 1L;

	//peter
	public Bird() {
		
	}
	public void paint(Graphics g) {
		
		final int BirdX = Konst.HEIGHT/2; 
		int BirdY = Konst.WIDTH/2;
		
		Graphics2D g2 = (Graphics2D)g;
		g2.fillRect(BirdX, BirdY, 20, 20);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE ) {
		System.out.println("heys");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		System.out.println("heys");
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		System.out.println("heys");
		
	}
	


}
