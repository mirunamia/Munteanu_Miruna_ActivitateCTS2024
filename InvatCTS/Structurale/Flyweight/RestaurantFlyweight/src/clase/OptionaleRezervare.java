package clase;

public class OptionaleRezervare {
    private int nrMasa;
    private int nrPersoane;
    private boolean masaCopii;

    public OptionaleRezervare(int nrMasa, int nrPersoane, boolean masaCopii) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.masaCopii = masaCopii;
    }

    public int getNrMasa() {
        return nrMasa;
    }

    public void setNrMasa(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    public void setNrPersoane(int nrPersoane) {
        this.nrPersoane = nrPersoane;
    }

    public boolean isMasaCopii() {
        return masaCopii;
    }

    public void setMasaCopii(boolean masaCopii) {
        this.masaCopii = masaCopii;
    }
}
