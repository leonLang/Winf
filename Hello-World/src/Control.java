import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class Control extends JLabel implements KeyListener{

	private static final long serialVersionUID = 1L;
	public Control() {
		addKeyListener(this);
	}
//peter
	  public void keyTyped(KeyEvent e) {

	      }

	      public void keyPressed(KeyEvent e) {
		        System.out.println("e");
	      }
	      public void keyReleased(KeyEvent e) {
		        System.out.println("e");
	      }
}
