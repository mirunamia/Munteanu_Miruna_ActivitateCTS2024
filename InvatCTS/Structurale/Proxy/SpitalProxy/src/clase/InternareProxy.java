package clase;

public class InternareProxy implements IPacient {
    private String nume;
    private boolean areCardSanatate;

    public InternareProxy(String nume, boolean areCardSanatate) {
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
        if(getAreCardSanatate()) {
            System.out.println("Pacientul " + this.getNume() + " a fost internat.");
        }
        else {
            System.out.println("Pacientul " + this.getNume() + " nu a fost internat deoarece nu are card de sanatate.");
        }
    }
}
