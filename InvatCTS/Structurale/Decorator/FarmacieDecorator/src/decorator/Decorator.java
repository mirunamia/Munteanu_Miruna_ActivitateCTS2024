package decorator;

import clase.BonDeCasa;
import clase.IBonDeCasa;

public abstract class Decorator implements IBonDeCasa {
    protected BonDeCasa bonDeCasa;

    public Decorator(BonDeCasa bonDeCasa) {
        this.bonDeCasa = bonDeCasa;
    }

    @Override
    public void printareBon() {
        System.out.println("La multi ani!");
    }

    public abstract void aplicareDiscount(float procentDiscount);
}
