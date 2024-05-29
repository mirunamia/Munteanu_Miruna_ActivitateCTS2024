package main;

import clase.Peluza;
import clase.Spectator;
import clase.VIP;

public class Main {
    public static void main(String[] args) {
        Spectator spectator = new Spectator("Andrei", new Peluza());
        spectator.verificareSpectator();

        spectator.setVerificare(new VIP());
        spectator.verificareSpectator();
    }
}