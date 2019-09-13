package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bedrag extends Applet{
    double Btw;
    TextField tekstvak;
    double g1;
    Label label;
    String q;


    public void init() {
        tekstvak = new TextField("Getal hier",30);
        label = new Label("Type hier een getal in" + " en Druk op ENTER");
        tekstvak.addActionListener(new TextvakListener());
        add(label);
        add(tekstvak);
        Btw = 1.21;
        q = "";

    }

    public void paint(Graphics g) {
        g.drawString(q + g1 * Btw,30,100);

    }
    class TextvakListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            g1 = Double.parseDouble(tekstvak.getText());
            repaint();

        }
    }
}