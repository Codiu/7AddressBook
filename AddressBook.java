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







    public static void main(String[] args) throws IOException, ClassNotFoundException {

        /*
            Make contacts as objects
            extend details, by storing object instead of String?
            implement Input inferface

        */
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
    }
}