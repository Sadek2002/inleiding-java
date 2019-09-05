package h01;

import java.applet.Applet;
import java.awt.*;

public class JavaApplet2 extends Applet {

    public void init() {
        setBackground(Color.white);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Sadek", 60, 60 );

        g.setColor(Color.red);
        g.drawString("al Mousawi", 60, 70 );
    }
}