package H10;

import javax.swing.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RuimVoldoende extends Applet {
    TextField tv;
    String s, tekst;
    int cijfer;



    public void init() {
        tv = new TextField(20);
        tv.addActionListener(new TekstListener());
        add(tv);
    }

    public class TekstListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            s = tv.getText();
            cijfer = Integer.parseInt(s);
            switch (cijfer) {

                case 1:
                    tekst = "Je cijfer " + cijfer + "is slecht";
                    break;
                case 2:
                    tekst = "Je cijfer " + cijfer + " is slecht";
                    break;
                case 3:
                    tekst = "Je cijfer " + cijfer + " is slecht";
                    break;
                case 4:
                    tekst = "Je cijfer " + cijfer + " is onvoldoende";
                    break;
                case 5:
                    tekst = "Je cijfer " + cijfer + " is matig";
                    break;
                case 6:
                    tekst = "Je cijfer " + cijfer + " is voldoende";
                    break;
                case 7:
                    tekst = "Je cijfer " + cijfer + " is Voldoende";
                    break;
                case 8:
                    tekst = "Je cijfer " + cijfer + " is goed";
                    break;
                case 9:
                    tekst = "Je cijfer " + cijfer + " is Goed";
                    break;
                case 10:
                    tekst = "Je cijfer " + cijfer + " is goed";
                    break;
                default:
                    tekst = "Je hebt een ongeldig cijfer ingevoerd";
            }
            getGraphics().drawString(tekst, 20, 50);
        }
    }
}



