package H11;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tafels extends Applet{

    int tafels,y;
    TextField vakje;
    Button okKnop;
    String s;


    public void init() {
        tafels = 1;

        vakje = new TextField(20);
        vakje.addActionListener(new VakjeListner());
        add(vakje);

        okKnop = new Button("OK");
        okKnop.addActionListener(new Knop1Listener());
        add(okKnop);

        s = "";



    }
    public class VakjeListner implements ActionListener{


        public void actionPerformed(ActionEvent e) {
            s = vakje.getText();
            tafels = Integer.parseInt(s);
            repaint();


        }
    }


    public void paint(Graphics g) {
        int y = 60;
        g.drawString("vul een getal van 1 t/m 10 in het vak",50,40);
        for (int i = 1; i <11 ; i++) {
            g.drawString(i + " x " + tafels + " = " + tafels * i,20,y);
            y += 15;


        }

    }
    public class Knop1Listener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            s = vakje.getText();
            tafels = Integer.parseInt(s);
            tafels++;
            vakje.setText(Integer.toString(tafels));
            repaint();

        }
    }
}
