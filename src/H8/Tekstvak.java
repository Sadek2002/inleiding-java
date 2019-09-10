package H8;

import java.awt.*;
        import java.applet.*;


public class Tekstvak extends Applet {
    // Knop
    Button knop, knop2;
    Label label;
    double getal;
    public void init() {
        // Knop
        knop = new Button();
        knop.setLabel( "OK" );
        add(knop);
        knop2 = new Button();
        knop2.setLabel( "RESET" );
        add(knop2);
    }

    public void paint(Graphics g) {
        g.drawString("Doet deze knop wel iets?", 50, 60 );
    }
}
