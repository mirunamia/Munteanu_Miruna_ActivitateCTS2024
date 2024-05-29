package main;

import clase.BonDeCasa;
import decorator.BonDecorat;

public class Main {
    public static void main(String[] args) {
        BonDeCasa bonDeCasa = new BonDeCasa(100.00f);
        bonDeCasa.printareBon();

        BonDecorat bonDecorat = new BonDecorat(bonDeCasa);
        bonDecorat.printareBon();
        bonDecorat.aplicareDiscount(10);
    }
}