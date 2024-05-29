package clase;

import observer.Observer;

public interface Subiect {
    void adaugaObserver(Observer observer);
    void stergeObserver(Observer observer);
    void trimiteNotificari(String mesaj);
}
