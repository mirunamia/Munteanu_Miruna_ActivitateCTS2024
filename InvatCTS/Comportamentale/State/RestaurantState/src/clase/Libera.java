package clase;

public class Libera implements Stare {
    @Override
    public void doAction(GestiuneMese masa) {
        System.out.println("Masa cu numarul " + masa.getNrMasa() + " a trecut in starea LIBERA.");
        masa.setStare(this);
    }
}
