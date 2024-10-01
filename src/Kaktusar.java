public class Kaktusar extends Krukväxter implements Näringsvätska {

    Kaktusar(double höjd, String name) {
        super(höjd, name);
    }

    @Override
    public String toString() {
        return "Växt-typ: " + VäxtTyper.KAKTUS.getTyp() +
                "\nNamn: " + getName() + "\nNäringsvätska: " + VäxtTyper.KAKTUS.getVätska()
                + "\nMängd: " + getBasMineralvatten() + " liter/dag";
    }
}
