package clase;

public class PersoanaFizica implements ModProcesare{
    @Override
    public void procesareDocumentePerosanaFizica(String serieBuletin, String serieAdeverintaMunca) {
        System.out.println("Au fost procesate documentele pentru persoana fizica; serie de Buletin " + serieBuletin + " si serie Adeverinta de Munca " + serieAdeverintaMunca);
    }

    @Override
    public void procesareDocumentePerosanaJuridica(String numarActInfiintareFirma, String numarDovadaRC) {

    }
}
