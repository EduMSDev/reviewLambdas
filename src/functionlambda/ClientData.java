package functionlambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class ClientData {

    public static void main(String[] args) {
        List<Client> clientList = Arrays.asList(new Client("Edu", 24, 2),
                new Client("Javi", 11, 4));
        List<Object> clientsNames = getClientsData(clientList, Client::getName);

        clientsNames.forEach(System.out::println);
    }

    /*The function interface uses the first generic to specify the type of
     the input object and the second is the type of the output object.*/
    public static List<Object> getClientsData(List<Client> clients, Function<Client, Object> function) {
        List<Object> listData = new ArrayList<>();
        for (Client client : clients) {
            listData.add(function.apply(client));
        }
        return listData;
    }
}
