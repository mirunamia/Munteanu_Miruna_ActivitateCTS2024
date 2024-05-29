package main;

import clase.FabricaPersoane;
import clase.Optionale;
import clase.Persoana;

public class Main {
    public static void main(String[] args) {
        FabricaPersoane fabricaPersoane = new FabricaPersoane();

        Optionale optional1 = new Optionale(1);
        Optionale optional2 = new Optionale(2);
        Optionale optional3 = new Optionale(3);

        Persoana persoana1 = (Persoana) fabricaPersoane.getPersoana(1);
        Persoana persoana2 = (Persoana) fabricaPersoane.getPersoana(2);
        Persoana persoana3 = (Persoana) fabricaPersoane.getPersoana(3);

        persoana1.descriere(optional1);
        persoana2.descriere(optional3);
        persoana3.descriere(optional2);
        
        System.out.println("Au fost desenate " + fabricaPersoane.getNrPersoane() + " persoane.");
    }
}