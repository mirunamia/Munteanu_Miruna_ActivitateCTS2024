package main;

import clase.RezervareDateClient;
import clase.FabricaRezervari;
import clase.OptionaleRezervare;

public class Main {
    public static void main(String[] args) {
        FabricaRezervari fabricaRezervari = new FabricaRezervari();
        OptionaleRezervare varianta1 = new OptionaleRezervare(3, 12, true);
        OptionaleRezervare varianta2 = new OptionaleRezervare(7, 5, false);

        RezervareDateClient rezervareDateClient = (RezervareDateClient) fabricaRezervari.getRezervare(1);
        rezervareDateClient.afisareDetalii(varianta1);
        fabricaRezervari.getRezervare(2).afisareDetalii(varianta2);

        fabricaRezervari.getListaRezervari();
    }
}