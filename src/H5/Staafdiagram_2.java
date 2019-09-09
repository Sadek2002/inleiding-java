import java.awt.*;
import java.applet.*;

public class Staafdiagram_2 extends Applet {

    // VARIABLEN DECLAREREN
    int gewichtValerie;
    int hoogteXas;
    int gewichtHans;
    int gewichtJeroen;

    public void init() {
        setSize(400,400);
        hoogteXas = 350;
        gewichtValerie = 40;
        gewichtHans = 80;
        gewichtJeroen = 100;
    }
    public void paint(Graphics g) {
        // Verticale as
        g.drawLine(50,50,50,hoogteXas);
        // Horizontale as
        g.drawLine(50,hoogteXas,hoogteXas,hoogteXas);

        // Tekenen van de staven
            // 1. Valerie
        g.setColor(Color.blue);
        g.fillRect(50,hoogteXas - gewichtValerie,80, gewichtValerie);
            // 2. Hans
        g.setColor(Color.red);
        g.fillRect(150,hoogteXas - gewichtHans,80, gewichtHans);
            // 3. Jeroen
        g.setColor(Color.yellow);
        g.fillRect(250,hoogteXas - gewichtJeroen,80, gewichtJeroen);

        // Text
        g.setColor(Color.black);
        g.drawString("Valerie",50,360);
        g.drawString("Hans",150,360);
        g.drawString("Jeroen",250,360);
        g.drawString("0",20,350);
        g.drawString("20",20,330);
        g.drawString("40",20,310);
        g.drawString("60",20,290);
        g.drawString("80",20,270);
        g.drawString("100",20,250);
    }
}
