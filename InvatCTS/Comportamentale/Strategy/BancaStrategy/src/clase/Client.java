package clase;

public class Client {
    private String serieBuletin;
    private String serieAdeverintaMunca;
    private String numarActInfiintareFirma;
    private String numarDovadaRC;
    private ModProcesare modProcesare;

    public Client(String serieBuletin, String serieAdeverintaMunca, String numarActInfiintareFirma, String numarDovadaRC) {
        this.serieBuletin = serieBuletin;
        this.serieAdeverintaMunca = serieAdeverintaMunca;
        this.numarActInfiintareFirma = numarActInfiintareFirma;
        this.numarDovadaRC = numarDovadaRC;
    }

    public String getSerieBuletin() {
        return serieBuletin;
    }

    public void setSerieBuletin(String serieBuletin) {
        this.serieBuletin = serieBuletin;
    }

    public String getSerieAdeverintaMunca() {
        return serieAdeverintaMunca;
    }

    public void setSerieAdeverintaMunca(String serieAdeverintaMunca) {
        this.serieAdeverintaMunca = serieAdeverintaMunca;
    }

    public String getNumarActInfiintareFirma() {
        return numarActInfiintareFirma;
    }

    public void setNumarActInfiintareFirma(String numarActInfiintareFirma) {
        this.numarActInfiintareFirma = numarActInfiintareFirma;
    }

    public String getNumarDovadaRC() {
        return numarDovadaRC;
    }

    public void setNumarDovadaRC(String numarDovadaRC) {
        this.numarDovadaRC = numarDovadaRC;
    }

    public ModProcesare getModProcesare() {
        return modProcesare;
    }

    public void setModProcesare(ModProcesare modProcesare) {
        this.modProcesare = modProcesare;
    }

    public static Client creareClientPF(String serieBuletin, String serieAdeverintaMunca) {
        return new Client(serieBuletin, serieAdeverintaMunca, null, null);
    }

    public static Client creareClientPJ(String numarActInfiintareFirma, String numarDovadaRC) {
        return new Client(null, null, numarActInfiintareFirma, numarDovadaRC);
    }
}
