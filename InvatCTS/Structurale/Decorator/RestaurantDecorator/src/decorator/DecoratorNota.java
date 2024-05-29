package decorator;

import clase.INotaDePlata;
import clase.NotaDePlata;

public abstract class DecoratorNota implements INotaDePlata {
    protected NotaDePlata notaDePlata;

    protected DecoratorNota(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    public void printeazaNota() {
        System.out.println("Nota este in valoare de " + notaDePlata.getSuma());
        System.out.println("La multi ani!");
    }
    public abstract void adaugaDiscount(float procent);
}
