package H10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GrootsteGetal extends Applet{

    TextField tv;
    boolean Getal1;
    int maxinput;
    int mininput;
    int userinput;

    public void init() {
  tv = new TextField(20);
  tv.addActionListener(new TekstListener());
  add(tv);
  maxinput = 0;
  mininput = 0;
  Getal1 = true;
    }

    public void paint(Graphics g) {
    g.drawString("Max input " + maxinput,50,100);
    g.drawString("Min input " + mininput,50,130);
}
    class TekstListener implements  ActionListener {

        public void actionPerformed(ActionEvent e)   {
            String userInputString = tv.getText();
            userinput = Integer.parseInt(userInputString);
            if (Getal1) {
                Getal1 = false;
                maxinput = userinput;
                mininput = userinput;
                repaint();
            } else {
                if (userinput > maxinput) {
                    maxinput = userinput;
                    repaint();
                } else if (userinput < mininput) {
                    mininput = userinput;
                    repaint();
                }
            }
        }
    }
}

