package H11;

import java.applet.Applet;
import java.awt.*;

public class Schaakbord extends Applet {
    int rij;
    int y;


    public void init() {
        setSize(500,500);
        setBackground(Color.green);
        y = 50;


    }


    public void paint(Graphics g) {
        // rijen
        for (rij = 0; rij < 8;) {
            // x as
            int x = 50;
            // blok zwart
            if (rij == 0|| rij == 2 || rij == 4 || rij == 6 ) {
                for (int kolom = 0; kolom <8 ; kolom++) {
                    // zwart/wit
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6 || kolom == 8) {
                        g.setColor(Color.black);
                        g.fillRect(x,y,20,20);
                    } else {
                        g.setColor(Color.white);
                        g.fillRect(x,y,20,20);
                    }
                    x += 20;

                }
                y += 20;


            }
            // blok wit
            else if (rij == 1 || rij == 3 || rij == 5 || rij == 7 ){
                for (int kolom = 0; kolom < 8; kolom++) {
                    if (kolom == 0 || kolom == 2 || kolom == 4 || kolom == 6 || kolom == 8){
                        g.setColor(Color.white);
                        g.fillRect(x,y,20,20);

                    } else {
                        g.setColor(Color.black);
                        g.fillRect(x,y,20,20);
                    }
                    x += 20;


                }
                y += 20;
            }
            rij++;
        }

    }
}