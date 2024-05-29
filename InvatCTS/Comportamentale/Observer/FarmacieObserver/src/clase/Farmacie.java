package clase;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class Farmacie implements Subiect{
    private List<Observer> abonati;

    public Farmacie() {
        this.abonati = new ArrayList<>();
    }

    @Override
    public void adaugaObserver(Observer observer) {
        abonati.add(observer);
    }

    @Override
    public void stergeObserver(Observer observer) {
        abonati.remove(observer);
    }

    @Override
    public void trimiteNotificari(String mesaj) {
        for(Observer observer : abonati) {
            observer.primireNotificari(mesaj);
        }
    }

    public void notificareOferte() {
        trimiteNotificari("A aparut o oferta pentru medicamentele cautate de dumneavoastra.");
    }
}
