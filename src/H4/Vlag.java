//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Vlag extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.pink);
        g.setColor(Color.red);
        g.fillRect(100, 20, 70, 10);
        g.setColor(Color.white);
        g.fillRect(100, 30, 70, 10);
        g.setColor(Color.blue);
        g.fillRect(100, 40, 70, 10);
        g.setColor(Color.gray);
        g.fillRect(100, 20, 5, 200);
        g.setColor(Color.green);
        g.fillRect(0, 200, 10000, 1000);
        g.setColor(Color.orange);
        g.fillRect(400, 20, 50, 50);

    }
}