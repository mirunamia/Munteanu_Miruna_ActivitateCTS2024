package model.zoo;

import model.animale.Vietate;

public class ZooKeeper {
    private String name;

    public ZooKeeper(String gigel) {
    }

    public void feedAnimal(Vietate vietate, String mancare) {
        vietate.eat(mancare);
    }
}
