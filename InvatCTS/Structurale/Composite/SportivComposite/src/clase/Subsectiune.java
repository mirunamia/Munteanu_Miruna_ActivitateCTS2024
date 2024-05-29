package clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Optiune{
    private List<Optiune> listaOptiune;
    private String nume;

    public Subsectiune(String nume) {
        this.listaOptiune = new ArrayList<Optiune>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        listaOptiune.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) {
        listaOptiune.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return listaOptiune.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("     Subsectiune: " + nume);
        for(Optiune optiune : listaOptiune) {
            optiune.descriere();
        }
    }
}
