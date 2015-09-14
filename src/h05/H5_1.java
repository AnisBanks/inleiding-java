package h05;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class H5_1 extends Applet{
	
	int lengte = 100;
	int breedte = 50;
	Color achtergrondkleur = Color.BLACK;
	Color binnenkleur = Color.MAGENTA;
	
	
	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		

	}
	
	public void paint(Graphics g) {
		  g.setColor(binnenkleur);
		  g.fillRect(130, 50, lengte, breedte);
		  g.fillOval(130, 120, lengte, breedte);
		  g.fillArc(250, 50, lengte, breedte, 0, 45);
		  
		  g.setColor(achtergrondkleur);
		  g.drawLine(10, 20, 100, 20);
		  g.drawString("Lijn", 40, 35);
		  g.drawRect(10, 50, lengte, breedte);
		  g.drawString("Rechthoek", 25, 115);
		  g.drawRoundRect(10, 120, lengte, breedte, 30, 30);
		  g.drawString("Afgeronde rechthoek", 0, 185);
		  g.drawOval(130, 50, lengte, breedte);
		  g.drawString("Gevulde rechthoek met ovaal", 105, 115);
		  g.drawString("Gevulde ovaal", 125, 185);
		  g.drawOval(260, 120, breedte, breedte);
		  g.drawString("Cirkel", 265, 185);
		  g.drawOval(250, 50, lengte, breedte);
		  g.drawString("Taartpunt met ovaal", 260, 115);
		
	}

}