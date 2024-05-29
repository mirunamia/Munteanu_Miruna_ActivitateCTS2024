package clase;

import java.util.HashMap;

public class FabricaReteta {
    private HashMap<Integer, IReteta> listaRetete;

    public FabricaReteta() {
        this.listaRetete = new HashMap<>();
    }

    public IReteta getReteta(int codReteta) {
        IReteta reteta = listaRetete.get(codReteta);
        if(reteta == null) {
            reteta = new Reteta("Camelia", 72234);
            listaRetete.put(codReteta, reteta);
        }
        return listaRetete.get(codReteta);
    }
}
