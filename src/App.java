import dao.ClientDAO;
import model.Client;

public class App {
    public static void main(String[] args) throws Exception {
        Client client = new Client();
        client.setName("Silvarney Henrique");
        client.setAge(37);

        new ClientDAO().save(client);
    }
}
