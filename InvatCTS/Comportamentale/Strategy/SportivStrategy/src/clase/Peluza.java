package clase;

public class Peluza implements Verificare{
    @Override
    public void verificare(String nume) {
        System.out.println("Au fost verificate bagajul si hainele spectatorului cu loc la peluza cu numele " + nume + ".\n");
    }
}
