//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Stoplicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.darkGray);
        g.fillRoundRect(20, 20, 50, 100, 10, 10);
        g.setColor(Color.red);
        g.fillArc(30, 25, 30, 30, 90, 360);
        g.setColor(Color.orange);
        g.fillArc(30, 55, 30, 30, 90, 360);
        g.setColor(Color.green);
        g.fillArc(30, 85, 30, 30, 90, 360);

}
}