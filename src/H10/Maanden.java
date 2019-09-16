package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextListener;

public class Maanden extends Applet{
TextField tekstvak;
int maand;
Label maandlabel;
String[] maanden = {"januari","februari","maart","april","mei","juni","juli","augustus","september","oktober","november","december"};
String[] dagen = {"31", "28", "31", "30","31,","30,","31","31","30","31","30","31"};
int inputValue = 0;

    public void init() {
        tekstvak = new TextField(20);
        tekstvak.addActionListener (new TekstListener());
        add(tekstvak);
        maandlabel = new Label();
        add(maandlabel);

    }
        public void paint(Graphics g){
            g.drawString("Maand /  " + maanden[inputValue - 1] + " dagen " + dagen[inputValue - 1], 50 ,50);

    }

        class TekstListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                inputValue = Integer.parseInt(tekstvak.getText());
                if (inputValue >= 1 && inputValue <= 12) {
                    repaint();
                }
        }
    }
}





