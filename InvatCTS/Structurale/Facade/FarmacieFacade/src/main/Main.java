package main;

import clase.FacadeMedicament;

public class Main {
    public static void main(String[] args) {
        FacadeMedicament medicament1 = new FacadeMedicament("Paracetamol", true, false, true);
        FacadeMedicament medicament2 = new FacadeMedicament("Triderm", true, true, true);
        FacadeMedicament medicament3 = new FacadeMedicament("Colebil", false, false, true);

        medicament1.verificareMedicament();
        medicament2.verificareMedicament();
        medicament3.verificareMedicament();
    }
}