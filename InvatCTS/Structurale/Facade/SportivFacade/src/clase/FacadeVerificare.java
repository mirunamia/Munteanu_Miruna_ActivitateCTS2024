package clase;

public class FacadeVerificare {
    private String codBilet;
    private boolean serieBuletinValid;
    private boolean esteCautatDePolitie;
    private boolean areAntecedente;

    public FacadeVerificare(String codBilet, boolean serieBuletinValid, boolean esteCautatDePolitie, boolean areAntecedente) {
        this.codBilet = codBilet;
        this.serieBuletinValid = serieBuletinValid;
        this.esteCautatDePolitie = esteCautatDePolitie;
        this.areAntecedente = areAntecedente;
    }

    public void verificareBilet() {
        VerificareNume verificareNume = new VerificareNume();
        VerificarePolitie verificarePolitie = new VerificarePolitie();
        VerificareStadioane verificareStadioane = new VerificareStadioane();

        if(verificareStadioane.verificareAntecedenteStadioane(areAntecedente) &&
                verificareNume.verificareBuletin(serieBuletinValid) &&
                verificarePolitie.verificareCautatPolitie(esteCautatDePolitie)) {
            System.out.println("Biletul cu codul " + codBilet + " a fost verificat, puteti intra la meci.");
        } else {
            System.out.println("Biletul cu codul " + codBilet + " a fost verificat. Nu respectati cerintele, nu puteti intra la meci.");
        }
    }
}
