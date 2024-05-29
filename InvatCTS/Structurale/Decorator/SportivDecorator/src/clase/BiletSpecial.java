package clase;

public class BiletSpecial extends Decorator {

    public BiletSpecial(Printabil bilet) {
        super(bilet);
    }

    public String getEchipa(){
        return super.bilet.getEchipa();
    }
    public boolean getEsteEchipaLocala() {
        return super.bilet.getEsteEchipaLocala();
    }
    @Override
    public void printare() {
        super.bilet.printare();
        if(this.getEsteEchipaLocala()) {
            System.out.println("Mult succes, " + this.getEchipa() + "!\n");
        }
    }


}
