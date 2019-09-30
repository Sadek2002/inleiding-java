package H12;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class Tekstvakken extends Applet {
    TextField tekstvakken[];
    Button okKnop;
    int nummers[];

    public void init() {
        tekstvakken = new TextField[5];
        nummers = new int[5];
        okKnop = new Button("OK");
        okKnop.addActionListener(new StonksListener());
        add(okKnop);

        for (int i = 0; i <tekstvakken.length ; i++) {
            tekstvakken[i] = new TextField("",10);
            add(tekstvakken[i]);
        }

    }

    public class StonksListener implements ActionListener{

        public void actionPerformed(ActionEvent e) {
            for (int t = 0; t <tekstvakken.length ; t++) {
                nummers[t] = Integer.parseInt(tekstvakken[t].getText());

            }
            Arrays.sort(nummers);
            for (int i = 0; i <tekstvakken.length ; i++) {
                tekstvakken[i].setText("" + (nummers[i]));

            }

        }
    }


}

© 2019 GitHub, Inc.