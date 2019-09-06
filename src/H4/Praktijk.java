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
    }
}
