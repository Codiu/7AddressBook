import java.io.*;
import java.util.ArrayList;


public class FileSystem {


    public static void saveIt(Contact contact) throws IOException, ClassNotFoundException  {

        ArrayList<Contact> arr = new ArrayList<>();
        // read file first
        try {
            System.out.println("reading the file...");

            FileInputStream fileInputStream = new FileInputStream("db.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

              arr = (ArrayList<Contact>) objectInputStream.readObject();
              // add contact to the end of Array

          }
        catch (Exception e) {
            System.out.println("File empty");
        }
        finally {
            System.out.println("continue...");

            arr.add(contact);
            // save file
            FileOutputStream fileOutputStream = new FileOutputStream("db.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(arr);
            System.out.println("Stored");
        }
    }


    public static void openIt() throws IOException, ClassNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("db.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Contact copyContacts = (Contact) objectInputStream.readObject();




    }
}
