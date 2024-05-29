package clase;

import java.util.ArrayList;
import java.util.List;

public class Loc implements Optiune{
    private String nume;

    public Loc(String nume) {
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) throws Exception {
        throw new Exception("Nu exista o alta subsectiune.");
    }

    @Override
    public void stergeNod(Optiune optiune) throws Exception {
        throw new Exception("Nu exista o alta subsectiune.");
    }

    @Override
    public Optiune getNod(int index) throws Exception {
        throw new Exception("Nu exista o alta subsectiune.");
    }

    @Override
    public void descriere() {
        System.out.println("          Loc: " + nume);
    }
}
