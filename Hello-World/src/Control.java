import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control implements KeyListener{

//peter
	  public void keyTyped(KeyEvent e) {
	        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
	        //	System.out.println("space1");
	        }
	      }

	      public void keyPressed(KeyEvent e) {
		        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
		        	//System.out.println("space2");
		        }
	      }
	      public void keyReleased(KeyEvent e) {
		        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
		        	//System.out.println("space3");
		        	Bird.move();
		        }
	      }
}
