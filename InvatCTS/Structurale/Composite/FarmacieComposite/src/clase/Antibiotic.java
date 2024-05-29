package clase;

import java.util.LinkedList;
import java.util.List;

public class Antibiotic implements Medicament{
    private List<Medicament> listaMedicamente;
    private String nume;
    private float pret;

    public Antibiotic(String nume, float pret) {
        this.listaMedicamente = new LinkedList<>();
        this.nume = nume;
        this.pret = pret;
    }

    @Override
    public void adauga(Medicament m) {
        this.listaMedicamente.add(m);
    }

    @Override
    public void sterge(Medicament m) {
        this.listaMedicamente.remove(m);
    }

    @Override
    public Medicament getMedicament(int index) {
        return this.listaMedicamente.get(index);
    }

    @Override
    public void afisare() {
        System.out.println("Antibioticul " + this.nume + " costa " + this.pret + " RON.");
        listaMedicamente.forEach(medicament -> medicament.afisare());
    }
}
