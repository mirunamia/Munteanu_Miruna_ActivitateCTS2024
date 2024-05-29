package clase;

import java.security.interfaces.DSAKey;

public class FacadeMedicament {
    private String nume;
    private boolean esteValabil;
    private boolean esteInSistem;
    private boolean esteInDepozit;

    public FacadeMedicament(String nume, boolean esteValabil, boolean esteInSistem, boolean esteInDepozit) {
        this.nume = nume;
        this.esteValabil = esteValabil;
        this.esteInSistem = esteInSistem;
        this.esteInDepozit = esteInDepozit;
    }

    public void verificareMedicament() {
        Sistem sistem = new Sistem();
        Depozit depozit = new Depozit();
        CardSanatate cardSanatate = new CardSanatate();

        if(sistem.verificaRetetaSistem(esteInSistem) && depozit.verificareMedicamentDepozit(esteInDepozit) && cardSanatate.verificareValabilitateCardSanatate(esteValabil)) {
            System.out.println("Medicamentul " + nume + " a fost gasit si poate fi vandut.");
        } else {
            System.out.println("Medicamentul " + nume + " nu poate fi vandut.");
        }
    }
}
