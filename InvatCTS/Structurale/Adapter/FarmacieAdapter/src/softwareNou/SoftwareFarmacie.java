package softwareNou;

public abstract class SoftwareFarmacie {
    protected String nume;
    protected int nrProduseExistente;
    protected int currentMedicamentId;

    protected SoftwareFarmacie() {
    }

    public SoftwareFarmacie(String nume, int nrProduseExistente,int currentMedicamentId) {
        this.nume = nume;
        this.nrProduseExistente = nrProduseExistente;
        this.currentMedicamentId = currentMedicamentId;
    }

    public abstract boolean verificaStocPentruMedicament(int ID, int nrMedicamente);
}
