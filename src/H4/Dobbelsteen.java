//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Dobbelsteen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(20, 20, 200, 200, 10, 10);
        g.fillArc(50, 50, 50, 50, 90, 360);
        g.fillArc(150, 150, 50, 50, 90, 360);
        g.fillArc(50, 150, 50, 50, 90, 360);
        g.fillArc(150, 50, 50, 50, 90, 360);
    }
}