/* this app to practice HashMaps
+ storing data by Serialization
  and extract from.
 */

import java.io.ObjectInputStream;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.Serializable;

import java.io.FileNotFoundException;
import java.io.IOException;


public class AddressBook implements Serializable {



    public static void addContact() throws IOException, ClassNotFoundException {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter contact name: ");
        String name = in.nextLine();
        System.out.println("Enter phone number of " + name + " ");
        String phone = in.nextLine();

        FileSystem.saveIt(new Contact(name, phone));
    }


    public static void showContacts() throws IOException, ClassNotFoundException {
        ArrayList<Contact> arr = FileSystem.readFile();
        for (Contact i : arr) {
            System.out.println("Name " + i.name + " Phone number: " + i.phone);
        }
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner input = new Scanner(System.in);
        System.out.println("Addressbook. What you willing to do?");
        System.out.println("1. List of all Contacts");
        System.out.println("2. Add new Contact");
        System.out.println("3. Remove Contacts");
        int action = input.nextInt();





        switch (action) {
            case 1 -> showContacts();
            case 2 -> addContact();
//            case 3 -> removeContacts();
        }











        // increase fields
        // show list of items
        // remove items

        // where to put Scanner input object?
        // what is this "throws" IO stuff?

        /*
            [DONE] create separate file system
            [DONE] [ISSUE] does not store multiple objects. How to do that? And how to access that? (Store ArrayList of objects)
            [DONE] method showing items
            [DONE] Make contacts as objects. how the hell we create new object every time we add account?
            [DONE] extend details, by storing object instead of String?
            [DONE] implement Input interface
        */

    }
}