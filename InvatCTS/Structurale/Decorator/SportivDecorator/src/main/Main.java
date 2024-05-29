package main;

import clase.Bilet;
import clase.BiletSpecial;
import clase.Decorator;
import clase.Printabil;

public class Main {
    public static void main(String[] args) {
        Printabil bilet1 = new Bilet("Steaua", "B1079",true);
        bilet1.printare();
        Decorator biletSpecial1 = new BiletSpecial(bilet1);
        biletSpecial1.printare();

        Printabil bilet2 = new Bilet("Dinamo", "B5403", false
        );
        Decorator biletSpecial2 = new BiletSpecial(bilet2);
        biletSpecial2.printare();
    }
}