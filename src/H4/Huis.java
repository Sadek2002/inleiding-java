//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.green);
        g.setColor(Color.black);
        g.drawRect(120, 120, 150, 70);
        g.drawRect(140, 145, 20, 20);
        g.drawRect(170, 130, 30, 60);
    }
}
