package clase;

public class Reteta implements IReteta {
    private String nume;
    private int nrAsigurare;

    public Reteta(String nume, int nrAsigurare) {
        this.nume = nume;
        this.nrAsigurare = nrAsigurare;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "nume='" + nume + '\'' +
                ", nrAsigurare=" + nrAsigurare +
                '}';
    }

    @Override
    public void descriere(Optiune optiune) {
        System.out.println("Reteta achizitionata de " + nume + ", numar Asigurare " + nrAsigurare + ".");
        System.out.println("Reteta este inregistrata cu numarul " + optiune.getNrReteta() + ", au fost cumparate " + optiune.getNrMedicamente()
        + " produse, iar totalul de plata este de " + optiune.getSumaPlata() + " RON.\n");
    }
}
