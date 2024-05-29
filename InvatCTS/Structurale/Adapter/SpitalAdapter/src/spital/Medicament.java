package spital;

public class Medicament extends SpitalMedicament{

    private Medicament() {
    }

    public Medicament(String numeMedicament, int codReteta) {
        super(numeMedicament, codReteta);
    }

    public boolean prezintaReteta(int cod) {
        if(codReteta == cod) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void achizitioneazaMedicament() {
        if(prezintaReteta(codReteta)) {
            System.out.println("Codul retetei a fost gasit. Medicamentul a fost achizitionat.");
        } else {
            System.out.println("Medicamentul nu a putut fi achizitionat, reteta nu a fost gasita.");
        }
    }
}
