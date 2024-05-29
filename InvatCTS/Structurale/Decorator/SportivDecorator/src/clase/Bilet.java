package clase;

public class Bilet implements Printabil{
    private String echipa;
    private String cod;
    private boolean esteEchipaLocala;

    public Bilet(String echipa, String cod, boolean esteEchipaLocala) {
        this.echipa = echipa;
        this.cod = cod;
        this.esteEchipaLocala = esteEchipaLocala;
    }

    public String getEchipa() {
        return echipa;
    }

    public String getCod() {
        return cod;
    }

    public boolean getEsteEchipaLocala() {
        return esteEchipaLocala;
    }

    @Override
    public void printare() {
        System.out.println("Biletul cu codul " + this.getCod() + " a fost printat!\n");
    }
}
