package testare;

import model.acvatic.Caras;
import model.animale.Leu;
import model.animale.Zebra;
import model.zoo.Zoo;
import model.zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo("Zoo Bucuresti", new ZooKeeper("Gigel"));
        zoo.adaugaVietate(new Leu(5, "Symba", 4), "carne");
        zoo.adaugaVietate(new Zebra(6, "Lizzy", 4), "fan");
        zoo.adaugaVietate(new Leu(3, "Scar", 4), "carne");
        zoo.adaugaVietate(new Caras(2, "Caras"), "mamaliga");
        zoo.feedAllAnimals();

        tipuriMancare tipCarnivor = tipuriMancare.CARNIVOR;
    }

    public enum tipuriMancare {
        CARNIVOR,
        IERBIVOR,
        OMNIVOR
    }
}