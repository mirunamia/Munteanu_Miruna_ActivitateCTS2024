package banca;

public class FacadeCont {
    private Cont cont;

    public FacadeCont(Cont cont) {
        this.cont = cont;
    }

    public boolean verificareDate() {
        return cont.verificareCreante() && cont.verificareVarsta() && cont.verificarePolitie();
    }
}
