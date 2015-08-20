package h01;

import java.applet.Applet;
import java.awt.*;

public class opdracht2_3 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.white);
  }

  public void paint(Graphics g) {
    g.setColor(Color.blue);
    g.drawString("Anis", 20, 40 );
    g.setColor(Color.red);
    g.drawString("Mojahid", 20, 60 );    
  }
}
    