package voetbalScore.project.model;

public class Wedstrijd {
    private static final String DEFAULT_NAAM_TEGENSTANDER = "Onbekend";
    private static final int DEFAULT_DOELPUNTEN = 0;

    private static final int WEDSTRIJDPUNTEN_WINST = 3;
    private static final int WEDSTRIJDPUNTEN_VERLIES = 0;
    private static final int WEDSTRIJDPUNTEN_GELIJKSPEL = 1;

    public String naamTegenstander;
    public int voorDoelpunten;
    public int tegenDoelpunten;

    public Wedstrijd(String naamTegenstander, int voorDoelpunten, int tegenDoelpunten) {
        this.naamTegenstander = naamTegenstander;
        this.voorDoelpunten = voorDoelpunten;
        this.tegenDoelpunten = tegenDoelpunten;
    }

    public Wedstrijd(String naamTegenstander) {
        this(naamTegenstander, DEFAULT_DOELPUNTEN, DEFAULT_DOELPUNTEN);
    }

    public Wedstrijd() {
        this(DEFAULT_NAAM_TEGENSTANDER);
    }

    public int bepaalWedstrijdPunten() {
        if (voorDoelpunten > tegenDoelpunten) {
            return WEDSTRIJDPUNTEN_WINST;
        } else if (voorDoelpunten < tegenDoelpunten) {
            return WEDSTRIJDPUNTEN_VERLIES;
        } else {
            return WEDSTRIJDPUNTEN_GELIJKSPEL;
        }
    }

    public void printUitslag() {
        System.out.printf("Uitslag van de wedstrijd tegen %s: %d-%d\n",
                naamTegenstander, voorDoelpunten, tegenDoelpunten);
    }

    public void printWedstrijdPunten() {
        System.out.printf("Dit levert %d wedstrijdpunten op.\n", bepaalWedstrijdPunten());
    }
}
