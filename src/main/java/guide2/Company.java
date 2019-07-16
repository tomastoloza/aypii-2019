package guide2;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class Company {
    private String address;
    private String name;
    private String phone;
    private String email;
    private String webPage;
    /*Se quiere modelar con UML e implementar la relación entre una empresa y sus clientes.
Una empresa puede tener cero o más clientes. De cada cliente, la empresa mantiene los
datos: nombre, dirección, teléfono e email. Las empresa se identifica con un nombre, y
posee dirección, teléfono, email y página web. La empresa identificará a cada cliente con
un identificador unívoco, numérico y consecutivo. La empresa puede: agregar un nuevo
cliente, eliminar un cliente determinado, y listar los clientes existentes.*/

    private ArrayList<Client> clientsList;

    public Company(String name, String address, String phone, String email, String webPage) {
        this.clientsList = new ArrayList<Client>();
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.webPage = webPage;
    }

    public void addClient(Client client) {
        UUID uuid = UUID.randomUUID();
        client.setId(uuid.toString());
        this.clientsList.add(client);
    }

    public boolean deleteClient(String uuid) {
        for (Client client : clientsList) {
            if (client.getId() == uuid) {
                this.clientsList.remove(client);
                return true;
            }
        }
        return false;
    }

    public ArrayList<Client> listClients() {
        /*String clients = "";
        for (Client client : this.clientsList) {
            clients.concat(client.getName() + client.getId());
        }*/
        return this.clientsList;
    }

    public static void main(String[] args) {
        Company company = new Company("asd", "asd 2 2 ", "123432", "wqee@qwel.ew", "asaddsdeqw.com");
        company.addClient(new Client("El pepe", "Sviva 21", "234842342", "qwekjnqwe@qkwl.com"));
        System.out.println(company.listClients());
        company.deleteClient(company.listClients().get(0).getId());
        System.out.println(company.listClients());


    }

}
