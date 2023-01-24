/* this app to practice HashMaps
+ storing data by Serialization
  and extract from.
 */

import java.util.Scanner;
import java.util.HashMap;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.FileNotFoundException;
import java.io.IOException;

public class AddressBook implements Serializable {



    public static void addContact() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter contact name: ");
        String name = in.nextLine();
        System.out.println("Enter phone number of " + name + " ");
        String phone = in.nextLine();





        System.out.println(new Contact(name, phone));





    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Addressbook. What you willing to do?");
        System.out.println("1. List of all Contacts");
        System.out.println("2. Add new Contact");
        System.out.println("3. Remove Contacts");
        int action = input.nextInt();

        addContact();


        /*
        switch (action) {
            case 1 -> listAll();
            case 2 -> addContact();
            case 3 -> removeContacts();
        }
        */









// create separate file system
// increase fields
        // method showing items
        // remove items
        // where to put Scanner input object?


        /*
            [DONE] Make contacts as objects. how the hell we create new object every time we add account?
            [DONE] extend details, by storing object instead of String?
            [DONE] implement Input inferface

        */

        /*
    HashMap<String, String> phoneBook = new HashMap<>();
    phoneBook.put("MichaelShumchaer", "8413213231");


// serialize
        FileOutputStream fileOutputStream = new FileOutputStream("db.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(phoneBook);

// deserialize
        FileInputStream fileInputStream = new FileInputStream("db.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        HashMap<String, String> bookCopy = (HashMap<String, String>) objectInputStream.readObject();


        System.out.println(bookCopy.get("MichaelShumchaer"));


         */
    }
}