package clase;

public class SubObservatie implements Stare{
    @Override
    public void actiune(Pacient pacient) {
        System.out.println("Pacientul " + pacient.getNume() + " este sub observatie.");
        pacient.setStare(this);
    }
}