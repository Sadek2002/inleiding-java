package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Maanden extends Applet{
TextField tekstvak;
int maand1;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstListener());
        add(tekstvak);

    }

    class TekstListener implements  ActionListener {
        public void actionPerformed(ActionEvent e) {
        maand1 = Integer.parseInt();
        if (maand1 == 1)

        }
    }
}





