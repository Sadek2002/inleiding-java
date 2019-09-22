package H11;

import java.applet.Applet;
import java.awt.*;

public class Fibonacci extends Applet {
    int maxgetal;
    int first;
    int second;
    int y;

    public void init() {
        setSize(400,400);

        maxgetal = 20;
        first = 0;
        second = 1;
        y = 50;


    }


    public void paint(Graphics g) {
        for (int i = 0; i <maxgetal ; i++) {

            int totaal = first + second;
            first = second;
            second = totaal;

            g.drawString(second + "",20,y);
            y += 15;

        }



    }
}