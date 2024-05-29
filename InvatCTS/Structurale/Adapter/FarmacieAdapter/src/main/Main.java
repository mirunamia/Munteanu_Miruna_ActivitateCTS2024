package main;

import aplicatieVeche.AdapterSoftware;
import aplicatieVeche.SistemAplicatie;
import softwareNou.SistemSoftware;
import softwareNou.SoftwareFarmacie;

public class Main {
    public static void main(String[] args) {
        SoftwareFarmacie softwareFarmacie = new SistemSoftware("Parasinus", 7,3);
        SistemAplicatie sistemAplicatie = new SistemAplicatie("Paracetamol",2,1);
        AdapterSoftware adapter = new AdapterSoftware("Nurofen",3,5,softwareFarmacie);

        if(sistemAplicatie.verificareDisponibilitate(2)){
            System.out.println("Exista medicamentul " + sistemAplicatie.getNume()+ " pe stoc. Stoc: " + sistemAplicatie.getNrProduseExistente());
        }

        if(adapter.verificareDisponibilitate(2)){
            System.out.println("Exista medicamentul " + adapter.getNume()+ " pe stoc. Stoc: " + adapter.getNrProduseExistente());
        }
    }
}