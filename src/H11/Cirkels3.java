package H11;

import java.applet.Applet;
import java.awt.*;

public class Cirkels3 extends Applet {

    public void init() {
        setSize(800,800);



    }


    public void paint(Graphics g) {
        int teller;
        int lengte,breedte;
        lengte = 20;
        breedte = 20;
        for (teller = 0;teller  < 100;teller++) {
            g.drawOval(40,10,lengte,breedte);
            lengte += 10;
            breedte += 10;

        }


    }
}