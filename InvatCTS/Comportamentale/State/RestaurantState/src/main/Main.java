package main;

import clase.*;

public class Main {
    public static void main(String[] args) {
        GestiuneMese masa1 = new GestiuneMese(1);
        GestiuneMese masa2 = new GestiuneMese(5);

        Stare stareRezervata = new Rezervata();
        Stare stareOcupata = new Ocupata();
        Stare stareLibera = new Libera();

        stareOcupata.doAction(masa1);
        stareRezervata.doAction(masa2);
        stareLibera.doAction(masa1);
    }
}