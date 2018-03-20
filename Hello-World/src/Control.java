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
		        	if(Konst.press == false) {
		        		Bird.move();
		        		Konst.press = true;
		        	}
		        	System.out.println(Konst.BirdY);
		        	Konst.run = true;
		        	
		        	
		        }
	      }
	      public void keyReleased(KeyEvent e) {
		        if(e.getKeyCode() == KeyEvent.VK_SPACE) {
		        	//System.out.println("space3");
		        	Konst.press = false;
		        }
	      } 
}
