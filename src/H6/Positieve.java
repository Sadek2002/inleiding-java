import java.awt.*;
import java.applet.*;


public class Positieve extends Applet {
    int a, b;
    double uitkomst;


    public void init() {
        a = 2147483647;
        b = 1;
        uitkomst = (a + b);
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}