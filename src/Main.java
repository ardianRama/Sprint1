import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

    Main() {
        //polymorfism, objekt med samma referens men kommer att anropa toString() i de olika klasserna/3 olika...
        //...koder/toString metoder kommer att exekveras.
        Krukväxter kaktusVäxt = new Kaktusar(0.2, "Igge");
        Krukväxter palmVäxt1 = new Palmer(5, "Laura");
        Krukväxter palmVäxt2 = new Palmer(1, "Olof");
        Krukväxter köttätandeVäxt = new KöttätandeVäxter(0.7, "Meatloaf");

        List<Krukväxter> list = new ArrayList<>();
        list.add(kaktusVäxt);
        list.add(palmVäxt1);
        list.add(palmVäxt2);
        list.add(köttätandeVäxt);

        Collections.sort(list);
        String allNames = "";
        for (Krukväxter l : list) {
            String getNamesFromList = l.getName();
            allNames += getNamesFromList + "\n";
        }

        String types = " ";
        for (VäxtTyper k : VäxtTyper.values()) {
            String t = k.getTyp();
            types += t + "\n";
        }
        JOptionPane.showMessageDialog(null, "Växthotellet \"Greenest\"\n" +
                "Typer av växter:\n" + types);

        while (true) {
            String s = JOptionPane.showInputDialog("Vilken växt ska få vätska?");
            if (s == null)
                System.exit(0);
            s = s.trim();
            if (s.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Du måste ange en växt");
                continue;
            }
            s = s.toLowerCase();

            while (true) {
                if (s.contains(palmVäxt1.getName().toLowerCase()))
                    JOptionPane.showMessageDialog(null, palmVäxt1.toString());

                else if (s.contains(palmVäxt2.getName().toLowerCase()))
                    JOptionPane.showMessageDialog(null, palmVäxt2.toString());

                else if (s.contains(kaktusVäxt.getName().toLowerCase()))
                    JOptionPane.showMessageDialog(null, kaktusVäxt.toString());

                else if (s.contains(köttätandeVäxt.getName().toLowerCase()))
                    JOptionPane.showMessageDialog(null, köttätandeVäxt.toString());

                else {
                    JOptionPane.showMessageDialog(null, "Växten hittas inte."
                            + "\nTillgängliga växter:\n" + allNames);
                }
                int button = JOptionPane.showConfirmDialog(null, "Vill du fortsätta?");
                if (button == 0)
                    break;
                else if (button == 1)
                    System.exit(0);
                else
                    System.exit(0);
            }
        }
    }


    public static void main(String[] args) {

        Main main = new Main();
    }
}