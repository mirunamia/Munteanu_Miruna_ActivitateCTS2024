package clase;

public abstract class PasiRezervare {
    private int nrMasa;

    public PasiRezervare(int nrMasa) {
        this.nrMasa = nrMasa;
    }

    public abstract void curatareMasa(int nrMasa);
    public abstract void asezareservetele(int nrMasa);
    public abstract void asezareTacamuri(int nrMasa);
    public abstract void stareRezervata(int nrMasa);

    public void rezervareMasa() {
        curatareMasa(nrMasa);
        asezareservetele(nrMasa);
        asezareTacamuri(nrMasa);
        stareRezervata(nrMasa);
    }
}
