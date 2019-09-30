package H12;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class Waarde extends Applet
{
    //Variabelen
    int[] getallen = {5, 99, 67, 59, 82, 24, 42, 4, 72, 15};
    TextField tekstvak;
    Button knopOK;
    String s, message;
    int userinput;

    public void init()
    {
        setSize(500,500);

        tekstvak = new TextField(20);
        knopOK = new Button("Search");
        tekstvak.addActionListener(new Vaklistener());
        knopOK.addActionListener(new Vaklistener());
        add(tekstvak);
        add(knopOK);

        message = "Welk getal wilt u zoeken?";
    }

    public class Vaklistener implements ActionListener
    {

        public void actionPerformed(ActionEvent e)
        {
            //invoer uit het tekstvak pakken en kijken of deze in de tabel staat
            s = tekstvak.getText();
            userinput = Integer.parseInt(s);
            for (int teller = 0; teller < getallen.length ; teller++)
            {
                if (userinput == getallen[teller])
                {
                    message = "Het getal " + userinput + " is gecvonden op Index " + teller;
                    break;
                }
                else
                {
                    message = "Dit getal staat niet in de index";
                }
            }
            repaint();
        }
    }

    public void paint(Graphics g)
    {
        g.drawString(message,20,50);
    }
}
© 2019 GitHub, Inc.