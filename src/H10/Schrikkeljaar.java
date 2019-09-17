package H10;

        import java.applet.Applet;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

        public class Schrikkeljaar extends Applet {
                TextField tekstvak;
                TextField tekstvak1;
                Label maandlabel;
                Label jaarlabel;
                String s, tekst;
                String d, tekst1;
        Button ok;
        int dag;
        private int jaartal;


        public void init(){
        tekstvak = new TextField("", 30);
        tekstvak1 = new TextField("", 10);
        maandlabel = new Label("Type het maandnummer");
        jaarlabel = new Label("Type het jaartal");
        tekstvak.addActionListener( new TekstvakListener() );
        tekstvak1.addActionListener( new TekstvakListener() );
        tekst = "";
        tekst1 = "";
        add(maandlabel);
        add(jaarlabel);
        add(tekstvak);
        add(tekstvak1);

}

        public void paint(Graphics g) {
        g.drawString(tekst,35,130);
        g.drawString(tekst1,35,150);

}

        class TekstvakListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                s = tekstvak.getText();
                dag = Integer.parseInt(s);
                d = tekstvak1.getText();
                jaartal = Integer.parseInt(d);
                if ((jaartal % 4 == 0 && !(jaartal % 100 == 0)) ||
                        jaartal % 400 == 0) {
                    tekst1 = "" + jaartal + " is een schrikkeljaar";
                } else {
                    tekst1 = "" + jaartal + " is geen schrikkeljaar";
                }

                repaint();

                switch (dag) {
                    case 1:
                        tekst = "Januari 31 dagen";
                        break;
                    case 2:
                        tekst = "Februari 29 dagen";
                        break;
                    case 3:
                        tekst = "Maart 31 dagen";
                        break;
                    case 4:
                        tekst = "April 30 dagen";
                        break;
                    case 5:
                        tekst = "Mei 31 dagen";
                        break;
                    case 6:
                        tekst = "Juni 30 dagen";
                        break;
                    case 7:
                        tekst = "Juli 31 dagen";
                        break;
                    case 8:
                        tekst = "Augustus 31 dagen";
                        break;
                    case 9:
                        tekst = "September 30 dagen";
                        break;
                    case 10:
                        tekst = "Oktober 31 dagen";
                        break;
                    case 11:
                        tekst = "November 30 dagen";
                        break;
                    case 12:
                        tekst = "December 31 dagen";
                        break;
                    default:
                        tekst = "Dit is geen maand";
            }
                tekstvak.setText(null);

                repaint();
        }
    }
}
