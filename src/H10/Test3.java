package H10;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Test3 extends Applet
{
    //Variabelen
    Button knopOK;
    TextField cijfervak;
    String t, tekst;
    double cijfers, totaal, conv;
    int teller;


    public void init() {
        totaal = 0;
        teller = 0;

        //tekstvak
        cijfervak = new TextField(15);
        cijfervak.addActionListener(new Bijhoudluister());
        add(cijfervak);

        //Okeknop
        knopOK = new Button("OK");
        knopOK.addActionListener(new Weergeven());
        add(knopOK);

        //geeft voldoende/onvoldoende weer
        tekst = "Voer een cijfer in";
    }


    //cijfers beihouden en kijken of het voldoende/onvoldoende is
    public class Bijhoudluister implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            t = cijfervak.getText();
            cijfers = Double.parseDouble(t);
            totaal = totaal + cijfers;
            teller++;
            if (cijfers <= 5.4)
            {
                tekst = "Je cijfer: " + cijfers + " is onvoldoende";
            }
            else
            {
                tekst = "Je cijfer: " + cijfers + " is voldoende";
            }
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        g.drawString(tekst,30, 80);
    }

    public class Weergeven implements ActionListener
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