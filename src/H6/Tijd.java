import java.awt.*;
import java.applet.*;


public class Tijd extends Applet {
    int seconden,uur, dag, jaar;
    double uitkomst;
    double uitkomst2;
    double uitkomst3;


    public void init() {
        seconden = 60;
        uur = 60;
        dag = 1440;
        jaar = 525600;
        uitkomst = (uur * seconden);
        uitkomst2 = (dag * seconden);
        uitkomst3 = jaar * seconden;
    }

    public void paint(Graphics g) {
        g.drawString("Seconden in", 20, 20);
        g.drawString("Uur: " + uitkomst, 20, 40);
        g.drawString("Dag: " + uitkomst2, 20, 60);
        g.drawString("Jaar: " + uitkomst3, 20, 80);
    }
}