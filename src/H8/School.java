package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class School extends Applet {
    // Knoppen
    Button Mannen;
    Button Vrouwen;
    Button Jongens;
    Button Meisjes;
    // Int
    int mannenteller;
    int vrouwenteller;
    int jongensteller;
    int meisjesteller;
    int totaal;

    public void init() {
        setSize(600, 600);
        KnopListener kl = new KnopListener();
        // Knoppen
        Mannen = new Button("Mannen");
        Mannen.addActionListener(kl);
        Vrouwen= new Button("Vrouwen");
        Vrouwen.addActionListener(new Vrouw());
        Jongens = new Button("Jongens");
        Jongens.addActionListener(new Man2());
        Meisjes = new Button("Meisjes");
        Meisjes.addActionListener(new Vrouw2());
        // Teller
        mannenteller = 0;
        vrouwenteller =0;
        jongensteller = 0;
        meisjesteller = 0;
        add(Mannen);
        add(Vrouwen);
        add(Jongens);
        add(Meisjes);
    }

    public void paint(Graphics g) {
        // text
        g.drawString("Aantal Mannen  " + mannenteller, 30, 50);
        g.drawString("aantal Vrouwen  " + vrouwenteller, 30, 70);
        g.drawString("aantal Jongens  " + jongensteller, 30, 90);
        g.drawString("aantal Meisjes  " + meisjesteller, 30, 110);
        g.drawString("Totaal  " + totaal , 30, 130);
        totaal= mannenteller + vrouwenteller + jongensteller + meisjesteller;
    }

    class KnopListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mannenteller++;
            totaal++;
            repaint();
        }
    }

    class Vrouw implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            vrouwenteller++;
            totaal++;
            repaint();
        }
    }

    class Man2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            jongensteller++;
            totaal++;
            repaint();
        }
    }

    class Vrouw2 implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            meisjesteller++;
            totaal++;
            repaint();
        }
    }
}