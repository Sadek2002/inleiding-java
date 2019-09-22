package H11;

import java.applet.Applet;
import java.awt.*;

public class Vierkanten extends Applet {

    public void init() {


    }

    public void paint(Graphics g) {
        int vierkanten;
        int x,y;
        x = 20;
        y = 50;
        for (vierkanten = 0;vierkanten  <5 ;vierkanten ++) {
            g.drawRect(x,y,20,20);
            x += 20;
            y += 20;

        }


    }
}