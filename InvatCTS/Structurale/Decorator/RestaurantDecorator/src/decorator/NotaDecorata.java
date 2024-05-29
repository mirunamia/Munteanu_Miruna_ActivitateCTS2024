package decorator;

import clase.NotaDePlata;

public class NotaDecorata extends DecoratorNota{
    public NotaDecorata(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void adaugaDiscount(float procent) {
        float discount = notaDePlata.getSuma() - (procent/100 * notaDePlata.getSuma());
        System.out.println("Nota dvs a fost redusa cu " + procent + "%. Noul pret este: " + discount);
    }
}
