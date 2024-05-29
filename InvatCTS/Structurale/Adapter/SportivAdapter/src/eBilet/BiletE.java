package eBilet;

public abstract class BiletE {
    protected String nume;
    protected String codQR;

    protected BiletE() {
    }

    public BiletE(String nume, String codQR) {
        this.nume = nume;
        this.codQR = codQR;
    }

    public String getNume() {
        return nume;
    }

    public abstract void rezervaBiletOnline(String tipBilet);
    public abstract void cumparaBiletOnline(String tipBilet);
}
