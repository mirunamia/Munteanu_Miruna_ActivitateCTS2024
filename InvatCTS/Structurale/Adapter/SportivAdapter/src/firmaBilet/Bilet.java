package firmaBilet;

public abstract class Bilet {
    //protected!!
    protected String nume;
    protected boolean esteInLoja;
    protected int nrPozitie;

    //protected!!!
    protected Bilet() {
    }

    public Bilet(String nume, boolean esteInLoja, int nrPozitie) {
        this.nume = nume;
        this.esteInLoja = esteInLoja;
        this.nrPozitie = nrPozitie;
    }

    public abstract void rezervareBilet(String tipBilet);
    public abstract void cumparareBilet(String tipBilet);
}
