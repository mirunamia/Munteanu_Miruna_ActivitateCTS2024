package main;

import clase.NotaDePlata;
import decorator.NotaDecorata;

public class Main {
    public static void main(String[] args) {
        NotaDePlata notaDePlata = new NotaDePlata(527.30f);
        notaDePlata.printeazaNota();

        NotaDecorata notaDecorata = new NotaDecorata(notaDePlata);
        notaDecorata.printeazaNota();
        notaDecorata.adaugaDiscount(50);
    }
}