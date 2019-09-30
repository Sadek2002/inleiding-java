package H8;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rekenmachine extends Applet {
    Button plus, keer, min, deel;
    TextField tekstvak1, tekstvak2;
    double getal1, getal2;


    public void init() {
        // Tekstvakken
        tekstvak1 = new TextField("", 20);
        add(tekstvak1);
        tekstvak2 = new TextField("", 20);
        add(tekstvak2);
        // Knoppen
        plus = new Button("+");
        plus.addActionListener(new PlusListener());
        keer = new Button("*");
        keer.addActionListener(new KeerListener());
        min = new Button("-");
        min.addActionListener(new MinListener());
        deel = new Button("/");
        deel.addActionListener(new DeelListener());
        add(plus);
        add(keer);
        add(min);
        add(deel);

    }

    class PlusListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            getal2 = Double.parseDouble(B);
            double uitkomst = getal1 + getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    class KeerListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            getal2 = Double.parseDouble(B);
            double uitkomst = getal1 * getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    class MinListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            getal2 = Double.parseDouble(B);
            double uitkomst = getal1 - getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }

    class DeelListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String A = tekstvak1.getText();
            getal1 = Double.parseDouble(A);
            String B = tekstvak2.getText();
            getal2 = Double.parseDouble(B);
            double uitkomst = getal1 / getal2;
            tekstvak1.setText(String.valueOf(uitkomst));
            tekstvak2.setText("");
        }
    }
}
