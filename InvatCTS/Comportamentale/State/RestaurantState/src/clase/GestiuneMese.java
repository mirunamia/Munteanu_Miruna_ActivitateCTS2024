package clase;

public class GestiuneMese {
    private int nrMasa;
    private Stare stare;

    public GestiuneMese(int nrMasa) {
        this.nrMasa = nrMasa;
        this.stare = null;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }
}
