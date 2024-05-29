package main;

import eBilet.BiletE;
import eBilet.SistemEBilet;
import firmaBilet.AdapterEBilet;
import firmaBilet.Bilet;

public class Main {
    public static void main(String[] args) {
        BiletE biletE = new SistemEBilet("Ion", "jhsaj");
        Bilet bilet = new AdapterEBilet(biletE);
        biletE.cumparaBiletOnline("Standard");
        bilet.rezervareBilet("Loja");
    }
}