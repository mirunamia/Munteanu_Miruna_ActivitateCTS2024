package clase;

import java.util.HashMap;

public class FabricaPersoane {
    private HashMap<Integer, IPersoana> listaPersoane;

    public FabricaPersoane() {
        this.listaPersoane = new HashMap<Integer, IPersoana>();
    }

    public IPersoana getPersoana(int codPersoana) {
        IPersoana persoana = listaPersoane.get(codPersoana);
        if(persoana == null) {
            persoana = new Persoana(1.75f, 50);
            listaPersoane.put(codPersoana, persoana);
        }
        return persoana;
    }

    public int getNrPersoane() {
        return listaPersoane.size();
    }
}
