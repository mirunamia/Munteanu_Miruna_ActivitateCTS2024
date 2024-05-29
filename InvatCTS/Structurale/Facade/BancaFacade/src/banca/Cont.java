package banca;

public class Cont {
    private int varsta;
    private boolean esteUrmarit;
    private boolean areCreante;

    public Cont(int varsta, boolean esteUrmarit, boolean areCreante) {
        this.varsta = varsta;
        this.esteUrmarit = esteUrmarit;
        this.areCreante = areCreante;
    }

    public int getVarsta() {
        return varsta;
    }

    public boolean getEsteUrmarit() {
        return esteUrmarit;
    }

    public boolean getAreCreante() {
        return areCreante;
    }

    public boolean verificareVarsta() {
        return this.getVarsta() >= 18;
    }

    public boolean verificarePolitie() {
        return !esteUrmarit;
    }

    public boolean verificareCreante(){
        return !areCreante;
    }
}
