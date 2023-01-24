public class Contact {
    String name;
    String phone;

    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
        System.out.println("Data recorded to object, but how? there is no instance");
    }

}
