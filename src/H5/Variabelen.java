//Voorbeeld 4.1

import java.awt.*;
import java.applet.*;

public class Variabelen extends Applet {
    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init() {
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        g.setColor(lijnkleur);
        g.drawLine(10, 20, 260, 20);
        g.drawString("Lijn", 125, 40);
        g.drawRect(10, 50, breedte, hoogte);
        g.drawString("Rechthoek", 105, 200);
        g.setColor(opvulkleur);
        g.fillRect(290, 50, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawArc(290, 50, breedte, hoogte, 90, 360);
        g.drawString("Gevulde rechthoek met ovaal", 350, 200);
        g.drawArc(570, 50, breedte, hoogte, 90, 360);
        g.setColor(opvulkleur);
        g.fillArc(570, 50, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawString("Taartpunt met ovaal eromheen", 620, 200);
        g.drawRoundRect(10, 210, breedte, hoogte, 10, 10);
        g.drawString("Afgeronde rechthoek", 80, 360);
        g.setColor(opvulkleur);
        g.fillOval(290, 210, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("Gevulde ovaal", 380, 360);
        g.drawArc(650, 210, breedte, hoogte, 90, 360);
        g.drawString("Cirkel", 695, 360);
    }
}
