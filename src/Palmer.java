public class Palmer extends Krukväxter implements Näringsvätska {

    Palmer(double höjd, String name) {
        super(höjd, name);
    }

    @Override
    public String toString() {
        return "Växt-typ: " + VäxtTyper.PALM.getTyp() +
                "\nNamn: " + getName() + "\nNäringsvätska: " + VäxtTyper.PALM.getVätska()
                + "\nMängd: " + (getBasKranvatten() * getHöjd()) + " liter/dag";
    }

}
