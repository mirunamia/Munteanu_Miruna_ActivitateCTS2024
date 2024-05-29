package clase;

public class BaniRetrasi extends RetragereBani {
    public BaniRetrasi(int IDCard, int PIN, float suma) {
        super(IDCard, PIN, suma);
    }

    @Override
    public void introducereCard(int IDCard) {
        System.out.println("Cardul cu ID-ul " + IDCard + " a fost introdus.");
    }

    @Override
    public void introducerePIN(int PIN) {
        System.out.println("PIN-ul " + PIN + " a fost introdus.");
    }

    @Override
    public void alegereSuma(float suma) {
        System.out.println("Suma de " + suma + " RON a fost selectata.");
    }

    @Override
    public void retragereBani(float suma) {
        System.out.println("Suma de " + suma + " RON a fost retrasa.");
    }

    @Override
    public void retragereCard(int IDCard) {
        System.out.println("Cardul cu ID-ul " + IDCard + " a fost retras.\n");
    }
}
