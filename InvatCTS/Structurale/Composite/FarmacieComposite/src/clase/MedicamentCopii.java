package clase;

public class MedicamentCopii implements Medicament{
    private String administrare;

    public MedicamentCopii(String administrare) {
        this.administrare = administrare;
    }

    @Override
    public void adauga(Medicament m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sterge(Medicament m) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Medicament getMedicament(int index) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void afisare() {
        System.out.println("Medicamentul este destinat copiilor si se administreaza " + this.administrare + ".\n");
    }
}
