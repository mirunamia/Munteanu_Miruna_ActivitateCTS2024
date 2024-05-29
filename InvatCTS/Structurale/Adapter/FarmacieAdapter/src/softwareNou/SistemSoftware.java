package softwareNou;

public class SistemSoftware extends SoftwareFarmacie{
    private SistemSoftware() {
    }

    public SistemSoftware(String nume, int nrProduseExistente, int currentMedicamentId) {
        super(nume, nrProduseExistente, currentMedicamentId);
    }

    public int getNrProduseExistente() {
        return nrProduseExistente;
    }

    @Override
    public boolean verificaStocPentruMedicament(int ID, int nrMedicamente) {
        System.out.println("S-a setat medicamentul cu ID-ul: " + ID);
        this.currentMedicamentId = ID;
        if(nrProduseExistente >= nrMedicamente){
            return true;
        }
        else {
            return false;
        }
    }
}
