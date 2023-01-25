/* this app to practice HashMaps
+ storing data by Serialization
  and extract from
 */

import java.util.Scanner;
import java.util.ArrayList;
import java.io.Serializable;

public class AddressBook implements Serializable {


    public static void addContact() {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter contact name: ");
        String name = in.nextLine();
        System.out.println("Enter phone number of " + name + " ");
        String phone = in.nextLine();

        FileSystem.saveIt(new Contact(name, phone));
    }

    public static void showContacts() {
        ArrayList<Contact> arr = FileSystem.readFile();
        for (Contact i : arr) {
            System.out.println("Name " + i.name + " Phone number: " + i.phone);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while(true) {
            System.out.println("Addressbook. What you willing to do?");
            System.out.println("1. List of all Contacts");
            System.out.println("2. Add new Contact");
            System.out.println("3. Exit");
            int action = in.nextInt();

            switch (action) {
                case 1 -> showContacts();
                case 2 -> addContact();
                case 3 -> System.exit(1);
            }
        }

        /*
            [DONE] what is this "throws" IO stuff? Handling exceptions
            [DONE] show list of items
            [DONE] create separate file system
            [DONE] [ISSUE] does not store multiple objects. How to do that? And how to access that? (Store ArrayList of objects)
            [DONE] method showing items
            [DONE] Make contacts as objects. how the hell we create new object every time we add account?
            [DONE] extend details, by storing object instead of String?
            [DONE] implement Input interface
        */
    }
}