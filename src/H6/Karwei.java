//Voorbeeld 6.4

import java.awt.*;
import java.applet.*;


public class Karwei extends Applet {

    int a, b, c;
    double uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = (a / b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("Jan:  " + uitkomst,20,40);
        g.drawString("Ali:  " + uitkomst,20,60);
        g.drawString("Jeannette:  " + uitkomst,20,80);
        g.drawString("Jij:  " + uitkomst,20,100);
    }
}