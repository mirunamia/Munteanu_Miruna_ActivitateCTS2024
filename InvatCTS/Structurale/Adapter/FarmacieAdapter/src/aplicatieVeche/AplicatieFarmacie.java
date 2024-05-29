package aplicatieVeche;

public abstract class AplicatieFarmacie {
    protected String nume;
    protected int nrProduseExistente;
    protected int currentMedicamentId;

    protected AplicatieFarmacie() {
    }

    public AplicatieFarmacie(String nume, int nrProduseExistente,int currentMedicamentId) {
        this.nume = nume;
        this.nrProduseExistente = nrProduseExistente;
        this.currentMedicamentId = currentMedicamentId;
    }

    public String getNume() {
        return nume;
    }

    public int getNrProduseExistente() {
        return nrProduseExistente;
    }

    public abstract void setareMedicament(int ID);
    public abstract boolean verificareDisponibilitate(int nrMedicamente);
}
