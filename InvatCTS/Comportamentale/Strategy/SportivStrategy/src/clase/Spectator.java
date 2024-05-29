package clase;

public class Spectator {
    private String nume;
    private Verificare modVerificare;

    public Spectator(String nume, Verificare modVerificare) {
        this.nume = nume;
        this.modVerificare = modVerificare;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public Verificare getVerificare() {
        return modVerificare;
    }

    public void setVerificare(Verificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public void verificareSpectator(){
        modVerificare.verificare(nume);
    }
}
