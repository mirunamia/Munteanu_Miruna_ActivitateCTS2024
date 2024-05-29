package main;

import clase.Loc;
import clase.Optiune;
import clase.Sectiune;
import clase.Subsectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        Optiune sectiune1 = new Sectiune("Tribuna");

        Optiune subsectiune1 = new Subsectiune("Tribuna Nord");
        Optiune subsectiune2 = new Subsectiune("Tribuna Sud");

        Optiune loc1 = new Loc("Loc1");
        Optiune loc1Subsectiune1 = new Loc("LocS1.1");
        Optiune loc2Subsectiune1 = new Loc("LocS1.2");
        Optiune loc1Subsectiune2 = new Loc("LocS2.1");

        sectiune1.adaugaNod(subsectiune1);
        sectiune1.adaugaNod(subsectiune2);
        sectiune1.adaugaNod(loc1);

        subsectiune1.adaugaNod(loc1Subsectiune1);
        subsectiune1.adaugaNod(loc2Subsectiune1);
        subsectiune2.adaugaNod(loc1Subsectiune2);

        sectiune1.descriere();
    }
}