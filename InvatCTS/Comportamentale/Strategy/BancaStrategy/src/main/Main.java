package main;

import clase.Client;
import clase.ModProcesare;
import clase.PersoanaFizica;
import clase.PersoanaJuridica;

public class Main {
    public static void main(String[] args) {
        Client clientPF = Client.creareClientPF("J83490", "H9892");
        Client clientPJ = Client.creareClientPJ("A83497", "B9893");

        ModProcesare modPF = new PersoanaFizica();
        ModProcesare modPJ = new PersoanaJuridica();

        clientPF.setModProcesare(modPF);
        clientPJ.setModProcesare(modPJ);

        modPF.procesareDocumentePerosanaFizica("J83490", "H9892");
        modPJ.procesareDocumentePerosanaJuridica("A83497", "B9893");
    }
}