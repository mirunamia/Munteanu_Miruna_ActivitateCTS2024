package spital;

public abstract class SpitalMedicament {
    protected String numeMedicament;
    protected int codReteta;

    protected SpitalMedicament() {
    }

    public SpitalMedicament(String numeMedicament, int codReteta) {
        this.numeMedicament = numeMedicament;
        this.codReteta = codReteta;
    }

    public abstract void achizitioneazaMedicament();
}
