package clase;

import java.util.ArrayList;
import java.util.List;

public class Subsectiune implements Optiune {
    private List<Optiune> listaOptiuni;
    private String nume;

    public Subsectiune(String nume) {
        this.listaOptiuni = new ArrayList<Optiune>();
        this.nume = nume;
    }

    @Override
    public void adaugaNod(Optiune optiune) {
        listaOptiuni.add(optiune);
    }

    @Override
    public void stergeNod(Optiune optiune) {
        listaOptiuni.remove(optiune);
    }

    @Override
    public Optiune getNod(int index) {
        return listaOptiuni.get(index);
    }

    @Override
    public void descriere() {
        System.out.println("     Subsectiunea " + nume);
        for(Optiune optiune : listaOptiuni) {
            optiune.descriere();
        }
    }
}
