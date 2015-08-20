package h01;

import java.applet.Applet;
import java.awt.*;

public class opdracht2_2 extends Applet {

  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public void init() {
    setBackground(Color.blue);
  }

  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.drawString("Anis Mojahid", 20, 40 );
  }
}