package aplicatieVeche;

import softwareNou.SoftwareFarmacie;

public class AdapterSoftware extends AplicatieFarmacie{
    private SoftwareFarmacie softwareFarmacie;

    private AdapterSoftware() {
    }

    public AdapterSoftware(String nume, int nrProduseExistente, int currentMedicamentId, SoftwareFarmacie softwareFarmacie) {
        super(nume, nrProduseExistente, currentMedicamentId);
        this.softwareFarmacie = softwareFarmacie;
    }


    @Override
    public void setareMedicament(int ID) {

    }

    @Override
    public boolean verificareDisponibilitate(int nrMedicamente) {
        return softwareFarmacie.verificaStocPentruMedicament(currentMedicamentId,nrMedicamente);
    }

}
