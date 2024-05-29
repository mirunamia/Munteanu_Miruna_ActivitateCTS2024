package clase;

public abstract class Decorator implements Printabil{
    //protected!!
    protected Printabil bilet;

    public Decorator(Printabil bilet) {
        this.bilet = bilet;
    }
}
