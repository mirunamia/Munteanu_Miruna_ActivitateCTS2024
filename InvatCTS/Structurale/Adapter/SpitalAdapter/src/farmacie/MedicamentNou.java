package farmacie;

public class MedicamentNou extends FarmacieMedicament{
    private MedicamentNou() {
    }

    public MedicamentNou(String numeMedicament) {
        super(numeMedicament);
    }

    @Override
    public void cumparaMedicament() {
        System.out.println("Medicamentul a fost achizitionat.");
    }
}
