package eBilet;

public class SistemEBilet extends BiletE{
    private static float pretBiletStandard = 200.00f;
    private static float pretBiletLoja = 400.00f;

    private SistemEBilet() {
    }

    public SistemEBilet(String nume, String codQR) {
        super(nume, codQR);
    }

    @Override
    public void rezervaBiletOnline(String tipBilet) {
        if(tipBilet == "Standard") {
            System.out.println("Biletul standard a fost rezervat!");
        } else if (tipBilet == "Loja") {
            System.out.println("Biletul loja a fost rezervat!");
        }
        else {
            System.out.println("Tipul de bilet solicitat nu exista!");
        }
    }

    public static float getPretBiletStandard() {
        return pretBiletStandard;
    }

    public static float getPretBiletLoja() {
        return pretBiletLoja;
    }

    @Override
    public void cumparaBiletOnline(String tipBilet) {
        if(tipBilet == "Standard") {
            System.out.println("Biletul in valoare de " + getPretBiletStandard() + " RON a fost achizitionat!");
        } else if (tipBilet == "Loja") {
            System.out.println("Biletul in valoare de " + getPretBiletLoja() + " RON a fost achizitionat!");
        }
        else {
            System.out.println("Tipul de bilet solicitat nu exista!");
        }
    }
}
