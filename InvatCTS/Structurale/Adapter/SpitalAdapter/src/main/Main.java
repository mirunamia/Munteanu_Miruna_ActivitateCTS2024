package main;

import farmacie.FarmacieMedicament;
import farmacie.MedicamentNou;
import spital.Adapter;
import spital.Medicament;
import spital.SpitalMedicament;

public class Main {
    public static void main(String[] args) {
        MedicamentNou medicamentNou = new MedicamentNou("Paracetamol");
        Medicament medicament = new Medicament("Aulin", 233894);

        Adapter adapter = new Adapter("Nurofen", 78388, medicamentNou);

        medicament.achizitioneazaMedicament();
        adapter.achizitioneazaMedicament();

    }
}