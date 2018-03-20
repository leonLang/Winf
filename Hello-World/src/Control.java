import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Control implements KeyListener{

//peter
	  public void keyTyped(KeyEvent e) {
	        if(e.getKeyCode() == KeyEvent.VK_SPACE) {

	        }
	      }

	      public void keyPressed(KeyEvent e) {
		        if(e.getKeyCode() == KeyEvent.VK_SPACE) {

		        	if(Konst.press == false) {
		        		Bird.move();
		        		Konst.press = true;
		        	}
		        	System.out.println(Konst.run);
		        	Konst.run = true;
		        	if(Konst.run == false) {
		        	Konst.BirdY = Konst.WIDTH/2;
		        	}

		        	
		        	
		        	
		        }
	      }
	      public void keyReleased(KeyEvent e) {
		        if(e.getKeyCode() == KeyEvent.VK_SPACE) {

		        	Konst.press = false;
		        }
	      } 
}
