package main;

import clase.Item;
import clase.Optiune;
import clase.Sectiune;
import clase.Subsectiune;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("-- Meniu initial --");
        Optiune sectiune1 = new Sectiune("Bauturi");
        Optiune sectiune2 = new Sectiune("Deserturi");

        Optiune subsectiuneBauturi1 = new Subsectiune("Sucuri");
        Optiune subsectiuneBauturi2 = new Subsectiune("Cafea");
        Optiune subsectiuneDeserturi1 = new Subsectiune("Torturi");

        Optiune itemSucuri1 = new Item("Sprite");
        Optiune itemSucuri2 = new Item("Cola");
        Optiune itemSucuri3 = new Item("Prigat");
        Optiune itemTort1 = new Item("Red Velvet");
        Optiune itemTort2 = new Item("Carrot Cake");
        Optiune itemCafea1 = new Item("Espresso");
        Optiune itemCafea2 = new Item("Cappuccino");


        sectiune1.adaugaNod(subsectiuneBauturi1);
        sectiune1.adaugaNod(subsectiuneBauturi2);

        sectiune2.adaugaNod(subsectiuneDeserturi1);

        subsectiuneBauturi1.adaugaNod(itemSucuri1);
        subsectiuneBauturi1.adaugaNod(itemSucuri2);
        subsectiuneBauturi1.adaugaNod(itemSucuri3);

        subsectiuneDeserturi1.adaugaNod(itemTort1);
        subsectiuneDeserturi1.adaugaNod(itemTort2);

        subsectiuneBauturi2.adaugaNod(itemCafea1);
        subsectiuneBauturi2.adaugaNod(itemCafea2);

        sectiune1.descriere();
        sectiune2.descriere();

        System.out.println("\n-- Meniu updatat --");
        subsectiuneBauturi1.stergeNod(itemSucuri3);
        sectiune1.descriere();
        sectiune2.descriere();
    }
}