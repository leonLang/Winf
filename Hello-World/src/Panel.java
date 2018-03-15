import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panel extends JPanel{
	 private Image bardejov;
	 
	//Leon
	public Panel() {
		initBoard();
	}
	   private void initBoard() {
	        
	        loadImage();
	        
	        int w = bardejov.getWidth(this);
	        int h =  bardejov.getHeight(this);
	        setPreferredSize(new Dimension(w, h));        
	    }
	private void loadImage() {
	        
	        ImageIcon ii = new ImageIcon("bg.png");
	        bardejov = ii.getImage();        
	    }
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
	     g.fillRect(100,100,150,250);
	     g.drawImage(bardejov, 100, 100, null);
	}
 
}
