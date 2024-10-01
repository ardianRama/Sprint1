import javax.swing.*;
import java.text.Collator;

abstract class Krukväxter implements Comparable<Krukväxter> {

    private double höjd;    //inkapsling av instansvariablerna
    private String name;

    Krukväxter(double höjd, String name) {
        setHöjd(höjd);
        this.name = name;
    }

    public void setHöjd(double höjd) {
        try {
            if (höjd < 0)
                throw new IllegalArgumentException("Negativ värde på höjd");
            this.höjd = höjd;
        } catch (IllegalArgumentException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.exit(0);
        }
    }

    public double getHöjd() {
        return höjd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Krukväxt " + höjd +
                "\n" + name;
    }

    //gör objekten naturligt jämförbara, behövs för att anropa metoden sort
    @Override
    public int compareTo(Krukväxter other) {
        Collator col = Collator.getInstance();
        col.setStrength(Collator.PRIMARY);
        return col.compare(this.name, other.name);
    }
}
