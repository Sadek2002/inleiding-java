package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Praktijk extends Applet {
    TextField nameninput,nummers;
    boolean stop;
    Button okKnop;
    int aantal;
    String[] usernames;
    public void init() {
        setSize(800,800);
        nameninput = new TextField("naam", 20);
        nummers = new TextField("Telnummer",30);
        stop = false;
        add(nameninput);
        add(nummers);
        okKnop = new Button("Ok");
        okKnop.addActionListener(new Knoplistener());
        add(okKnop);
        usernames = new String[10];

        /* NullPointerException Fix */
        Arrays.fill(usernames, "");
    }

    public void paint(Graphics g) {
        int y = 50;
        for (String namen : usernames)
        {
            g.drawString(namen, 60, y+=15);
        }
    }

    public class Knoplistener implements ActionListener
    {
        String snamen, snummers;
        public void actionPerformed(ActionEvent e)
        {
            //nummers en namen uit de tekstvakken halen
            snamen = nameninput.getText().toLowerCase();
            snummers = nummers.getText();
            if (aantal < usernames.length);
            {
                usernames[aantal] = "Naam " + snamen + "   Tel-nummer: " + snummers;
                aantal++;
                System.out.println("Nummers toegevoegd "+ aantal);

                if (aantal == usernames.length)
                {
                    stop = true;
                }
            }
            //wanneer er genoeg (10) nummers/namen zijn toegevoegd
            if (stop)
            {
                Arrays.sort(usernames);
                repaint();
            }
            nameninput.setText("");
            nummers.setText("");
        }
    }
}