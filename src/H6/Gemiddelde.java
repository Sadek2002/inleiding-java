import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class Gemiddelde extends Applet {
    double a, b, c;
    double uitkomst;


    public void init() {
        a =5.9;
        b =6.3;
        c =6.9;
        uitkomst = (a + b + c) / 3;
        uitkomst *= 10;
        uitkomst = (int) uitkomst;
        uitkomst = uitkomst / 10;

    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}