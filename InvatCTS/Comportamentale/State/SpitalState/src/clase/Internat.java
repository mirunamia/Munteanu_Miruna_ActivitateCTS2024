package clase;

public class Internat implements Stare{
    @Override
    public void actiune(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este internat.");
        pacient.setStare(this);
    }
}
