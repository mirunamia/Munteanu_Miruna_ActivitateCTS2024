package clase;

public class Tribuna implements Verificare{
    @Override
    public void verificare(String nume) {
        System.out.println("A fost verificat bagajul spectatorului cu loc in tribuna cu numele " + nume + ".\n");
    }
}
