package clase;

public class Optiune {
    private int nrReteta;
    private float sumaPlata;
    private int nrMedicamente;

    public Optiune(int nrReteta, float sumaPlata, int nrMedicamente) {
        this.nrReteta = nrReteta;
        this.sumaPlata = sumaPlata;
        this.nrMedicamente = nrMedicamente;
    }

    public int getNrReteta() {
        return nrReteta;
    }

    public void setNrReteta(int nrReteta) {
        this.nrReteta = nrReteta;
    }

    public float getSumaPlata() {
        return sumaPlata;
    }

    public void setSumaPlata(float sumaPlata) {
        this.sumaPlata = sumaPlata;
    }

    public int getNrMedicamente() {
        return nrMedicamente;
    }

    public void setNrMedicamente(int nrMedicamente) {
        this.nrMedicamente = nrMedicamente;
    }
}
