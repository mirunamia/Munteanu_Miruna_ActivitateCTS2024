package main;

import clase.FabricaReteta;
import clase.Optiune;

public class Main {
    public static void main(String[] args) {
        FabricaReteta retete = new FabricaReteta();

        Optiune optiune1 = new Optiune(273, 85.95f, 3);
        retete.getReteta(1).descriere(optiune1);

        Optiune optiune2 = new Optiune(290, 173.60f, 5);
        retete.getReteta(2).descriere(optiune2);
    }
}