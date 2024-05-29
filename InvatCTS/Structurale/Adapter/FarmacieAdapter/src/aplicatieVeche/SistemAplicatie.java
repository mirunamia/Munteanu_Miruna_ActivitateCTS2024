package aplicatieVeche;

public class SistemAplicatie extends AplicatieFarmacie{
    private SistemAplicatie() {
    }

    public SistemAplicatie(String nume, int nrProduseExistente, int currentMedicamentId) {
        super(nume, nrProduseExistente, currentMedicamentId);
    }

    public int getNrProduseExistente() {
        return nrProduseExistente;
    }

    @Override
    public void setareMedicament(int ID) {
        this.currentMedicamentId = ID;
    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamente) {
        if (nrProduseExistente <= nrMedicamente) {
            return true;
        }
        else {
            return false;
        }
    }
}
