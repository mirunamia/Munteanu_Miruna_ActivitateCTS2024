package main;

import clase.FacadeVerificare;

public class Main {
    public static void main(String[] args) {
        FacadeVerificare verificare1 = new FacadeVerificare("B107354", false, false, false);
        FacadeVerificare verificare2 = new FacadeVerificare("B106308", true, false, false);

        verificare1.verificareBilet();
        verificare2.verificareBilet();
    }
}