package clase;

public class Externat implements Stare{
    @Override
    public void actiune(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este externat.");
        pacient.setStare(this);
    }
}