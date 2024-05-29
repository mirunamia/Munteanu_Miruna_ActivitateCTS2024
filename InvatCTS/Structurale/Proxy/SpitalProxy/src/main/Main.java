package main;

import clase.Internare;
import clase.InternareProxy;
import clase.IPacient;

public class Main {
    public static void main(String[] args) {
        IPacient IPacient1 = new Internare("Costica", false);
        IPacient IPacient2 = new InternareProxy("Camelia", true);
        IPacient IPacient3 = new InternareProxy("Jorje", false);

        IPacient1.internare();
        IPacient2.internare();
        IPacient3.internare();
    }
}