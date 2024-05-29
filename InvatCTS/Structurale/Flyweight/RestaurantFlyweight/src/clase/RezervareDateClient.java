package clase;

public class RezervareDateClient implements IRezervare{
    private String nume;
    private String nrTelefon;

    public RezervareDateClient(String nume, String nrTelefon) {
        this.nume = nume;
        this.nrTelefon = nrTelefon;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getNrTelefon() {
        return nrTelefon;
    }

    public void setNrTelefon(String nrTelefon) {
        this.nrTelefon = nrTelefon;
    }

    @Override
    public String toString() {
        return "Clientul cu numele " + nume + " si numarul de telefon " + nrTelefon + " a facut o rezervare.\n";
    }

    @Override
    public void afisareDetalii(OptionaleRezervare masa) {
        System.out.println("Clientul cu numele " + nume + " si numarul de telefon " + nrTelefon + " a facut o rezervare.");
        System.out.println("Aceasta va avea masa numarul " + masa.getNrMasa() + ", va avea " + masa.getNrPersoane() + " persoane" +
                " si " + (masa.isMasaCopii() ? "va fi nevoie" : "nu va fi nevoie") + " de o masa pentru copii.\n");
    }
}
