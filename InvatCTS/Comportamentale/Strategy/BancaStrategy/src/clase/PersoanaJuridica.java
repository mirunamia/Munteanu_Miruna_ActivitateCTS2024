package clase;

public class PersoanaJuridica implements ModProcesare{
    @Override
    public void procesareDocumentePerosanaFizica(String serieBuletin, String serieAdeverintaMunca) {

    }

    @Override
    public void procesareDocumentePerosanaJuridica(String numarActInfiintareFirma, String numarDovadaRC) {
        System.out.println("Au fost procesate documentele pentru persoana juridica;  " +
                "numar inregistrare pentru actele de înființare a firmei " + numarActInfiintareFirma +
        " si numarul dovezii înregistrării la Registrul comerțului " + numarDovadaRC);
    }
}
