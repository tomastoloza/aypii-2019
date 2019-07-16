package guide2;

import java.util.UUID;

public class Client {
    private String uuid;
    private String name;
    private String address;
    private String phone;
    private String email;

    public Client(String name, String address, String phone, String email) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
    }

    public void setId(String uuid) {
        this.uuid = uuid;
    }

    public String getId() {
        return this.uuid;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "uuid='" + uuid + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
