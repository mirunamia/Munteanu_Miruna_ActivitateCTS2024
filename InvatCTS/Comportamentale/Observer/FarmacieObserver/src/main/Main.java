package main;

import clase.Farmacie;
import observer.ClientAbonat;
import observer.Observer;

public class Main {
    public static void main(String[] args) {
        Observer o1 = new ClientAbonat("Cecilia");
        Observer o2 = new ClientAbonat("Laurentiu");
        Observer o3 = new ClientAbonat("Ricardo");

        Farmacie farmacie = new Farmacie();

        farmacie.adaugaObserver(o1);
        farmacie.adaugaObserver(o2);
        farmacie.adaugaObserver(o3);

        farmacie.notificareOferte();
    }
}