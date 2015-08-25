package h01;

import java.applet.Applet;
import java.awt.*;

public class opdracht4_4 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
	  g.drawRect(40, 20, 50, 20);
	  g.drawRect(40, 40, 50, 20);
	  g.drawRect(40, 60, 50, 20);
	  g.drawLine(40, 130, 40, 20);
	  
	  g.setColor(Color.red);
	  g.fillRect(40, 20, 50, 20);
	  g.setColor(Color.blue);
	  g.fillRect(40, 60, 50, 20);
  }
} 
    