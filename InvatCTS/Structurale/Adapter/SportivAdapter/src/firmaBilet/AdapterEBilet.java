package firmaBilet;

import eBilet.BiletE;

public class AdapterEBilet extends Bilet{
    private BiletE biletE;

    private AdapterEBilet() {
    }

    public AdapterEBilet(BiletE biletE) {
        super(biletE.getNume(), false, -1);
        this.biletE = biletE;
    }

    @Override
    public void rezervareBilet(String tipBilet) {
        this.biletE.rezervaBiletOnline(tipBilet);
    }

    @Override
    public void cumparareBilet(String tipBilet) {
        this.biletE.cumparaBiletOnline(tipBilet);
    }
}
