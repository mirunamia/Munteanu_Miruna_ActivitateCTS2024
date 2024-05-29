package clase;

public class VIP implements Verificare{
    @Override
    public void verificare(String nume) {
        System.out.println("A fost verificat biletul spectatorului VIP cu numele " + nume + ".\n");
    }
}
