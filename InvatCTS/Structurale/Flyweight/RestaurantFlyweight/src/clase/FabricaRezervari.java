package clase;

import java.util.HashMap;

public class FabricaRezervari {
    private HashMap<Integer, IRezervare> listaRezervari;

    //fara parametri!!
    public FabricaRezervari() {
        //initializeaza lista!!
        this.listaRezervari = new HashMap<Integer, IRezervare>();
    }

    public HashMap<Integer, IRezervare> getListaRezervari() {
        return listaRezervari;
    }

    public IRezervare getRezervare(int codRezervare) {
        IRezervare rezervare = listaRezervari.get(codRezervare);
        if(rezervare == null){
            rezervare = new RezervareDateClient("Ana", "0723872");
            listaRezervari.put(codRezervare, rezervare);
        }
        return rezervare;
    }
}
