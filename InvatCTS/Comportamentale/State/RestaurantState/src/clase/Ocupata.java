package clase;

public class Ocupata implements Stare {
    @Override
    public void doAction(GestiuneMese masa) {
        System.out.println("Masa cu numarul " + masa.getNrMasa() + " a trecut in starea OCUPATA.");
        masa.setStare(this);
    }
}
