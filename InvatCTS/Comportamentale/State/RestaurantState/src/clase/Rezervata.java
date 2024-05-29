package clase;

public class Rezervata implements Stare {
    @Override
    public void doAction(GestiuneMese masa) {
        System.out.println("Masa cu numarul " + masa.getNrMasa() + " a trecut in starea REZERVATA.");
        masa.setStare(this);
    }
}
