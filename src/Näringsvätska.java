public interface Näringsvätska {
    //variablerna blir implicit finala
    double basKranvatten = 0.5;
    double basProteindryck = 0.1;
    double basMineralvatten = 0.02;

    //använder defaultmetoder istället för abstracta metoder
    default double getBasKranvatten() {
        return basKranvatten;
    }

    default double getBasProteindryck() {
        return basProteindryck;
    }

    default double getBasMineralvatten() {
        return basMineralvatten;
    }
}
