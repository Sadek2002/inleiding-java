package H13;

import java.applet.Applet;
import java.awt.*;

public class Baksteen extends Applet {

    public void init() {
        setSize(400,400);

    }
    void muurTekenen(Graphics g,int x1, int y1, int breete, int hoogte){
        int steenteller;
        boolean rij2 = false;
        for (steenteller = 0; steenteller < 5; steenteller++ ){
            g.setColor(Color.red);
            g.fillRect(x1, y1, breete, hoogte);
            g.setColor(Color.black);
            g.drawRect(x1, y1, breete, hoogte);
            x1  += breete;
        }
        if (steenteller == 5){
            rij2 = true;
        }
        if (rij2){
            for (int muurteller = 0; muurteller < 5; muurteller++) {
                x1 = 20;
                y1 += hoogte;
                for (steenteller = 0; steenteller < 5; steenteller++) {
                    g.setColor(Color.red);
                    g.fillRect(x1, y1, breete, hoogte);
                    g.setColor(Color.black);
                    g.drawRect(x1, y1, breete, hoogte);
                    x1 += breete;
                }
            }

        }


    }

    public void paint(Graphics g) {
        muurTekenen(g,20,50,100,50);

    }
}