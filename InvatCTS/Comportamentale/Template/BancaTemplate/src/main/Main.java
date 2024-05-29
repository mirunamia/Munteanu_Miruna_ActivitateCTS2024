package main;

import clase.BaniRetrasi;
import clase.RetragereBani;

public class Main {
    public static void main(String[] args) {
        RetragereBani retragereBani = new BaniRetrasi(234, 7856, 300.50f);
        retragereBani.operatiuneRetragere();

        retragereBani.setSuma(500.00f);
        retragereBani.operatiuneRetragere();
    }
}