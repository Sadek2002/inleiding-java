package H13;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BetonBlokken extends Applet {
    Button beton, roodsteen;
    TextField muurHoogte, muurBreedte;
    private Boolean betonmuur, roodsteenmuur;
    int hoogte, breedte;


    public void init() {
        betonmuur = false;
        roodsteenmuur = false;

        setSize(500, 800);

        // knopppen toe voegen
        beton = new Button("Betonen muur");
        roodsteen = new Button("Stenen muur");
        beton.addActionListener(new BetonListener());
        roodsteen.addActionListener(new RoodsteenListener());
        add(beton);
        add(roodsteen);

        // tevakken toe voegen
        muurHoogte = new TextField("hoogte", 20);
        muurBreedte = new TextField("breedte", 20);
        add(muurHoogte);
        add(muurBreedte);

    }


    public void paint(Graphics g) {
        if (roodsteenmuur) {
            roodsteen(g, hoogte, breedte);
        }
        if (betonmuur) {
            beton(g, hoogte, breedte);
        }
        g.drawString("gebruik hoogt = 50 en breedte = 100",50,80);

    }
    public class BetonListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            hoogte = Integer.parseInt(muurHoogte.getText());
            breedte = Integer.parseInt(muurBreedte.getText());
            betonmuur = true;
            roodsteenmuur = false;
            repaint();


        }
    }

    public class RoodsteenListener implements ActionListener {


        public void actionPerformed(ActionEvent e) {
            hoogte = Integer.parseInt(muurHoogte.getText());
            breedte = Integer.parseInt(muurBreedte.getText());
            betonmuur = false;
            roodsteenmuur = true;
            repaint();


        }
    }

    void roodsteen(Graphics g, int hoogte, int breedte) {
        int teller = 0;
        int x, y = 40, breette = 50, hoog = 25, breedteEind = 25, beginX;
        Color zwart = Color.BLACK;
        Color rood = Color.RED;
        for (teller = 0; teller < hoogte; teller++) {
            x = 50;
            beginX = breedte + breedteEind;
            // Even rijen
            if (teller % 2 == 0) {
                /* Eindstukken van de muur */
                for (int i = 0; i < breedte; i++) {
                    if (i == 0 || i == breedte - 1) {
                        g.setColor(zwart);
                        g.drawRect(beginX, y, breedteEind, hoogte);
                        g.setColor(rood);
                        g.fillRect(beginX + 1, y + 1, breedteEind - 1, hoogte - 1);
                        beginX = breette * breedte;
                    }
                    // Vullen
                    else {
                        g.setColor(zwart);
                        g.drawRect(x, y, breette, hoogte);
                        g.setColor(rood);
                        g.fillRect(x + 1, y + 1, breette - 1, hoogte - 1);
                    }
                    x += breette;

                }

            } else {
                x = breedte + breedteEind;
                for (int i = 0; i < breette - 1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x, y, breedte, hoogte);
                    g.setColor(rood);
                    g.fillRect(x + 1, y + 1, breedte - 1, hoogte - 1);
                    x += breedte;
                }
            }
            y += hoog;
        }
    }



    private void beton(Graphics g, int hoogte, int breedte){
        int teller = 0;
        int x, y = 40, breette = 100, hoog = 50, breedteEind = 25, beginX;
        Color zwart = Color.BLACK;
        Color grijs = Color.GRAY;
        for (teller = 0; teller < hoogte; teller++) {
            x = 50;
            beginX = breedte + breedteEind;
            // Even rijen
            if (teller % 2 == 0) {
                /* Eindstukken van de muur */
                for (int i = 0; i < breedte; i++) {
                    if (i == 0 || i == breedte - 1) {
                        g.setColor(zwart);
                        g.drawRect(beginX, y, breedteEind, hoogte);
                        g.setColor(grijs);
                        g.fillRect(beginX + 1, y + 1, breedteEind - 1, hoogte - 1);
                        beginX = breette * breedte;
                    }
                    // Vullen
                    else {
                        g.setColor(zwart);
                        g.drawRect(x, y, breette, hoogte);
                        g.setColor(grijs);
                        g.fillRect(x + 1, y + 1, breette - 1, hoogte - 1);
                    }
                    x += breette;

                }

            } else {
                x = breedte + breedteEind;
                for (int i = 0; i < breette - 1; i++) {
                    g.setColor(zwart);
                    g.drawRect(x, y, breedte, hoogte);
                    g.setColor(grijs);
                    g.fillRect(x + 1, y + 1, breedte - 1, hoogte - 1);
                    x += breedte;
                }

            }
            y += hoog;

        }
    }
}
