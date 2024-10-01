public class KöttätandeVäxter extends Krukväxter implements Näringsvätska {

    KöttätandeVäxter(double höjd, String name) {
        super(höjd, name);
    }

    @Override
    public String toString() {
        return "Växt-typ: " + VäxtTyper.KÖTTÄTANDE.getTyp() +
                "\nNamn: " + getName() + "\nNäringsvätska: " + VäxtTyper.KÖTTÄTANDE.getVätska()
                + "\nMängd: " + (getBasProteindryck() + (0.2 * getHöjd())) + " liter/dag";
    }
}
