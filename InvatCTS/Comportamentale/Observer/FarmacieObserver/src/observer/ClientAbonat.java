package observer;

public class ClientAbonat implements Observer{
    private String numeClient;

    public ClientAbonat(String numeClient) {
        this.numeClient = numeClient;
    }

    @Override
    public void primireNotificari(String mesaj) {
        System.out.println("Draga, " + numeClient);
        System.out.println(mesaj + "\n");
    }
}
