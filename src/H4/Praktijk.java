//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(10, 20, 260, 20);
        g.drawString("Lijn", 125, 40);
        g.drawRect(10, 50, 260, 130);
        g.drawString("Rechthoek", 105, 200);
        g.setColor(Color.magenta);
        g.fillRect(290, 50, 260, 130);
        g.setColor(Color.black);
        g.drawArc(290, 50, 260, 130, 90, 360);
        g.drawString("Gevulde rechthoek met ovaal", 350, 200);
        g.drawArc(570, 50, 260, 130, 90, 360);
        g.setColor(Color.magenta);
        g.fillArc(570, 50, 260, 130, 0, 45);
        g.setColor(Color.black);
        g.drawString("Taartpunt met ovaal eromheen", 620, 200);
        g.drawRoundRect(10, 210, 260, 130, 10, 10);
        g.drawString("Afgeronde rechthoek", 80, 360);
        g.setColor(Color.magenta);
        g.fillOval(290, 210, 260, 130);
        g.setColor(Color.black);
        g.drawString("Gevulde ovaal", 380, 360);
        g.drawArc(650, 210, 120, 120, 90, 360);
        g.drawString("Cirkel", 695, 360);
    }
}
