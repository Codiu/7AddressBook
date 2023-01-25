import java.io.*;
import java.util.ArrayList;

public class FileSystem {

    public static ObjectInputStream openFile() {

        try {
            FileInputStream fileInputStream = new FileInputStream("db.txt");
            return new ObjectInputStream(fileInputStream);
        }
        catch (Exception E) {
        }
        return null;
    }

    public static ArrayList<Contact> readFile() {

        try {
            return (ArrayList<Contact>) openFile().readObject();
        }
        catch (Exception e){
        }
        return null;
    }


    public static void saveIt(Contact contact) {

        ArrayList<Contact> arr = new ArrayList<>();
        // read file first
        try {
            System.out.println("reading the file...");
            
             ObjectInputStream objectInputStream = openFile();
              arr = (ArrayList<Contact>) objectInputStream.readObject();
          }
        catch (Exception e) {
            System.out.println("File empty");
            System.out.println("continue...");
        }

            // add contact to the end of Array
            arr.add(contact);
            // save file

            try {
                FileOutputStream fileOutputStream = new FileOutputStream("db.txt");
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
                objectOutputStream.writeObject(arr);
                System.out.println("Stored");
            }
            catch (Exception E) {
                System.out.println("Some error. Cannot be stored");
            }
    }
}