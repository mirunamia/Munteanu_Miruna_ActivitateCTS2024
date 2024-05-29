package decorator;

import clase.BonDeCasa;

public class BonDecorat extends Decorator {


    public BonDecorat(BonDeCasa bonDeCasa) {
        super(bonDeCasa);
    }

    @Override
    public void aplicareDiscount(float procentDiscount) {
        float discount = this.bonDeCasa.getSuma() - (procentDiscount/100)*(this.bonDeCasa.getSuma());
        System.out.println("Bonul dumneavoastra a primit un discount de " + procentDiscount + " la suta. Noul pret este: " + discount);
    }
}
