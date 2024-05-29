package clase;

public class Rezervare extends PasiRezervare {

    public Rezervare(int nrMasa) {
        super(nrMasa);
    }

    @Override
    public void curatareMasa(int nrMasa) {
        System.out.println("Masa cu numarul " + nrMasa + " a fost curatata.");
    }

    @Override
    public void asezareservetele(int nrMasa) {
        System.out.println("Masa cu numarul " + nrMasa + " are servete.");
    }

    @Override
    public void asezareTacamuri(int nrMasa) {
        System.out.println("Masa cu numarul " + nrMasa + " are tacamuri.");
    }

    @Override
    public void stareRezervata(int nrMasa) {
        System.out.println("Masa cu numarul " + nrMasa + " a fost rezervata.");
    }
}
