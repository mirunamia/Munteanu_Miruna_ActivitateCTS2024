package clase;

public class Internare implements IPacient {

    private String nume;
    private boolean areCardSanatate;

    public Internare(String nume, boolean areCardSanatate) {
        this.nume = nume;
        this.areCardSanatate = areCardSanatate;
    }

    public String getNume() {
        return nume;
    }

    public boolean getAreCardSanatate() {
        return areCardSanatate;
    }

    @Override
    public void internare() {
        System.out.println("Pacientul " + this.getNume() + " a fost internat.");
    }
}
