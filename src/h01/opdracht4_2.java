package h01;

import java.applet.Applet;
import java.awt.*;

public class opdracht4_2 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
	  	g.drawRect(40, 90, 50, 60);
	  	g.drawLine(40, 90, 65, 60);
	    g.drawLine(65, 60, 90, 90);
	    g.drawLine(40, 90, 90, 90);
	    g.drawRect(50, 100, 10, 20);
	    g.drawRect(65, 120, 20, 30);
  }
} 
    