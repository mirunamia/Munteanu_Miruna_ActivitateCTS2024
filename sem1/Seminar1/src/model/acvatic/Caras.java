package model.acvatic;

public class Caras extends Peste{
    public Caras(int nrInotatoare, String rasa) {
        super(nrInotatoare, rasa);
    }

    @Override
    public void eat(String mancare) {
        var sb = new StringBuilder();
        //ce returneaza append?
        sb.append("Carasul ").append(getRasa()).append(" mananca ").append(mancare);
        System.out.println(sb);
    }
}
