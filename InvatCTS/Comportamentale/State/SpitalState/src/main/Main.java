package main;

import clase.*;

public class Main {
    public static void statusPacient(Pacient pacient) {
        Stare subObservatie = new SubObservatie();
        Stare externat = new Externat();

        if(!pacient.isStareFoarteRea()) {
            externat.actiune(pacient);
        } else {
            subObservatie.actiune(pacient);
        }
    }

    public static void main(String[] args) {
        Stare internat = new Internat();

        Pacient pacient1 = new Pacient("Ion",false);
        Pacient pacient2 = new Pacient("Angela",true);

        internat.actiune(pacient1);
        internat.actiune(pacient2);

        statusPacient(pacient1);
        statusPacient(pacient2);
    }
}