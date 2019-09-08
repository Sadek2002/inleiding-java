
import java.awt.*;
import java.applet.*;

public class Gewicht extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.black);
        g.setColor(Color.gray);
        g.fillRect(0, 0, 500, 700);
        g.setColor(Color.white);
        g.drawLine(100, 100, 400, 100);
        g.drawLine(100, 200, 400, 200);
        g.drawLine(100, 300, 400, 300);
        g.drawLine(100, 400, 400, 400);
        g.drawLine(100, 500, 400, 500);
        g.drawLine(100, 600, 400, 600);
        g.setColor(Color.red);
        g.fillRect(125, 400, 50, 200);
        g.setColor(Color.yellow);
        g.fillRect(225, 200, 50, 400);
        g.setColor(Color.blue);
        g.fillRect(325, 100, 50, 500);
        g.setColor(Color.white);
        g.drawString(String.valueOf(100),100,100);
        g.drawString(String.valueOf(80),100,200);
        g.drawString(String.valueOf(60),100,300);
        g.drawString(String.valueOf(40),100,400);
        g.drawString(String.valueOf(20),100,500);
        g.drawString(String.valueOf(0),100,600);
        g.drawString("Valerie", 125, 650 );
        g.drawString("Hans", 225, 650 );
        g.drawString("Jeroen", 325, 650 );
    }
}
