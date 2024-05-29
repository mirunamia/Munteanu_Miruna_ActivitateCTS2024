package clase;

public class BonDeCasa implements IBonDeCasa{
    private float suma;

    public BonDeCasa(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    public void setSuma(float suma) {
        this.suma = suma;
    }

    @Override
    public void printareBon() {
        System.out.println("A fost printat bonul cu suma " + suma + ".\n");
    }
}
