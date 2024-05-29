package spital;

import farmacie.MedicamentNou;

public class Adapter extends SpitalMedicament{
    private MedicamentNou medicamentNou;

    private Adapter() {
    }

    public Adapter(String numeMedicament, int codReteta, MedicamentNou medicamentNou) {
        super(numeMedicament, codReteta);
        this.medicamentNou = medicamentNou;
    }

    @Override
    public void achizitioneazaMedicament() {
        medicamentNou.cumparaMedicament();
    }
}
