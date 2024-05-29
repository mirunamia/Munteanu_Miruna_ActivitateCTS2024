package farmacie;

public abstract class FarmacieMedicament {
    protected String numeMedicament;

    protected FarmacieMedicament() {
    }

    public FarmacieMedicament(String numeMedicament) {
        this.numeMedicament = numeMedicament;
    }

    public abstract void cumparaMedicament();
}
