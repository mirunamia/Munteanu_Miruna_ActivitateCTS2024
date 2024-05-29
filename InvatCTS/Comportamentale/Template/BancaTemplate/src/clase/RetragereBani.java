package clase;

public abstract class RetragereBani {
    //protected!!
    protected int IDCard;
    protected int PIN;
    protected float suma;

    public RetragereBani(int IDCard, int PIN, float suma) {
        this.IDCard = IDCard;
        this.PIN = PIN;
        this.suma = suma;
    }

    public abstract void introducereCard(int IDCard);
    public abstract void introducerePIN(int PIN);
    public abstract void alegereSuma(float suma);
    public abstract void retragereBani(float suma);
    public abstract void retragereCard(int IDCard);

    public final void operatiuneRetragere() {
        introducereCard(IDCard);
        introducerePIN(PIN);
        alegereSuma(suma);
        retragereBani(suma);
        retragereCard(IDCard);
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }
}
