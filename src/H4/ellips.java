
//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class ellips extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);
        g.fillArc(10, 50, 300, 150, 90, 360);
    }
}
