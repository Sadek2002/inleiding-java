//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Tekenen extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.red);
        g.drawLine(50, 160, 140, 160);
        g.drawLine(50, 160, 90, 40);
        g.drawLine(40, -80, 140, 160);
    }
}