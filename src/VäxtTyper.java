public enum VäxtTyper {
    KÖTTÄTANDE("Köttätande", "Proteindryck"),
    KAKTUS("Kaktus", "Mineralvatten"),
    PALM("Palm", "Kranvatten");

    private final String typ;
    private final String vätska;

    VäxtTyper(String typ, String vätska) {
        this.typ = typ;
        this.vätska = vätska;
    }

    String getTyp() {
        return typ;
    }

    String getVätska() {
        return vätska;
    }

}
