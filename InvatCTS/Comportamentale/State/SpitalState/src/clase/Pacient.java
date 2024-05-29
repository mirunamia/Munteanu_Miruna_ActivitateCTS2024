package clase;

public class Pacient {
    private String nume;
    private Stare stare;
    private boolean stareFoarteRea;

    public Pacient(String nume, boolean stareFoarteRea) {
        this.nume = nume;
        this.stare = null;
        this.stareFoarteRea = stareFoarteRea;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public boolean isStareFoarteRea() {
        return stareFoarteRea;
    }

    public void setStareFoarteRea(boolean stareFoarteRea) {
        this.stareFoarteRea = stareFoarteRea;
    }
}
