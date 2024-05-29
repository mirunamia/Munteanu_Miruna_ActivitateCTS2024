package clase;

public class Persoana implements IPersoana{
    private float inaltime;
    private float latime;

    public Persoana(float inaltime, float latime) {
        this.inaltime = inaltime;
        this.latime = latime;
    }

    @Override
    public void descriere(Optionale optionale) {
        System.out.println("Persoana desenata cu inaltimea de " + inaltime + " metri si latimea de " + latime + " centimetri. Nr loc: " + optionale.getNrLoc());
    }
}
