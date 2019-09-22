package H11;

import java.applet.Applet;
import java.awt.*;

public class Cirkels extends Applet {

    public void init() {

    }


    public void paint(Graphics g) {
        int teller;
        int lengte,breedte,x,y;
        x = 50;
        y = 50;
        lengte = 20;
        breedte = 20;
        for (teller = 0;teller  < 5;teller ++) {
            g.drawOval(x,y,lengte,breedte);
            x += -5;
            y += -5;
            lengte += 10;
            breedte += 10;

        }

    }
}