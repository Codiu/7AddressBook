import java.io.Serializable;

public class Contact implements Serializable {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

}
