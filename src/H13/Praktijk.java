package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class Praktijk extends Applet {

    public void init() {

        setSize(800, 500);

    }

    public void paint(Graphics g) {
        boomTekenen(g);

    }

    public void boomTekenen(Graphics g) {
        //bruin maken opdracht 1.0
        Color Bruin = new Color(153, 102, 0);
        //kleuren voor boom
        Color Groen = Color.green;
        Color boomstam = Bruin;
        //grootes en lengtes voor boom
        int bladsize = 80;
        int x = 20;
        int y = 50;
        int hoogte = 120;
        int breedte = 50;
        int boomstamX = 35;
        int boomstamY = 110;
        //bos tekenen
        for (int bosteller = 0; bosteller < 2; bosteller++) {
            // opdracht 2.0
            //Rij een maken
            for (int rijteller = 0; rijteller < 5; rijteller++) {
                g.setColor(boomstam);
                g.fillRect(boomstamX, boomstamY, breedte, hoogte);
                g.setColor(Groen);
                g.fillOval(x, y, bladsize, bladsize);

                x += bladsize;
                boomstamX += bladsize;
            }
            //rij twee
            for (int tweederij = 0; tweederij < 4; tweederij++) {
                x = -15;
                y = 80;
                boomstamX = -5;
                boomstamY = 140;

                g.setColor(boomstam);
                g.fillRect(boomstamX, boomstamY, breedte, hoogte);
                g.setColor(Groen);
                g.fillOval(x, y, bladsize, bladsize);

                x += bladsize;
                boomstamX += bladsize;
                y += 30;
            }


        }
    }
}