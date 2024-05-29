package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        Medicament medicamentRaceala1 = new Raceala("Panadol", 10.50f);
        Medicament medicamentRaceala2 = new Raceala("Parasinus", 10.50f);
        Medicament medicamentDurere = new Durere("Nurofen", 17.50f);
        Medicament medicamentAntibiotic = new Antibiotic("Aulin", 25.00f);

        Medicament medicamentAdulti = new MedicamentAdulti("1p/12h");
        Medicament medicamentDurereCopii = new MedicamentCopii("0.5p/12h");
        Medicament medicamentCopii = new MedicamentCopii("10ml/6h");

        medicamentRaceala1.adauga(medicamentCopii);
        medicamentRaceala2.adauga(medicamentAdulti);
        medicamentDurere.adauga(medicamentAdulti);
        medicamentDurere.adauga(medicamentDurereCopii);
        medicamentAntibiotic.adauga(medicamentAdulti);

        medicamentRaceala1.afisare();
        medicamentRaceala2.afisare();
        medicamentDurere.afisare();
        medicamentAntibiotic.afisare();

        System.out.println("Test index");
        medicamentDurere.getMedicament(0).afisare();
        medicamentDurere.getMedicament(1).afisare();
    }
}