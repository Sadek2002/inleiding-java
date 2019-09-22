
package H11;

import java.awt.*;
import java.applet.*;


public class Getallen extends Applet {

    public void init() {}

    public void paint(Graphics g) {
        int teller = 10;
        int y = 0;

        while(teller < 20) {
            y += 20;
            g.drawString("" + teller, 305, y );
            teller++;
        }
    }
}