package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gemiddelde2 extends Applet {
    TextField tekstvak;
    Button ok;
    int teller;
    double cijfers, totaal, conv;
    String t, tekst;

    public void init() {
        totaal = 0;
        teller = 0;

        ok = new Button("OK");
        ok.addActionListener(new KnopListener());
        add(ok);

        tekstvak = new TextField("", 20);
        tekstvak.addActionListener(new TekstListener());
        add(tekstvak);
}

    public class TekstListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            t = tekstvak.getText();
            cijfers = Double.parseDouble(t);
            totaal = totaal + cijfers;
            teller++;
            if (cijfers <= 5.4) {
                tekst = "Je cijfer: " + cijfers + " is onvoldoende";
            } else {
                tekst = "Je cijfer: " + cijfers + " is voldoende";
            }
            repaint();
        }
    }

    public void paint(Graphics g) {
        g.drawString(tekst,30,80);
}

    public class KnopListener implements ActionListener
    {
        String uitkomst;
        public void actionPerformed(ActionEvent e)
        {
            totaal = totaal/teller;
            totaal = totaal *10;
            totaal = (int) totaal;
            conv = totaal;
            conv = conv/10;
            if (totaal <= 5.4)
            {
                uitkomst = "Je gemiddelde is " + conv + " je bent niet geslaagd";
            }
            else
            {
                uitkomst = "Je gemiddelde is " + conv + " je bent geslaagd";
            }
            getGraphics().drawString(uitkomst,30, 100);
        }
    }
}