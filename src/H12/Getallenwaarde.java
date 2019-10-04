package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Getallenwaarde extends Applet {
    int[] cijfers = {1,1,3,2,23,23};
    TextField tekstvak;
    int input,aantal;
    String bericht;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener(new TekstVeldListener());
        add(tekstvak);
        bericht = "voer een getal in";

    }
    public class TekstVeldListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            input = Integer.parseInt(tekstvak.getText());
            for (int counter = 0; counter < cijfers.length; counter++) {
                if (cijfers[counter] == input)
                {
                    aantal++;
                }
            }

            if (aantal > 0)
            {
                bericht = "Het getal " + input + " staat " + aantal + " keer in de tabel";
            }
            else
            {
                bericht = "Het getal " + input + " staat niet in de tabel";
            }
            repaint();

            aantal = 0;
        }
    }

    public void paint(Graphics g) {
        g.drawString(bericht,20, 50);

    }
}