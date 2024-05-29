package clase;

public class NotaDePlata implements INotaDePlata{
    public float suma;

    public NotaDePlata(float suma) {
        this.suma = suma;
    }

    public float getSuma() {
        return suma;
    }

    @Override
    public void printeazaNota() {
        System.out.println("Nota este in valoare de " + suma );
    }
}
