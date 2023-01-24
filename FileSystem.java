import java.io.*;
import java.util.ArrayList;


public class FileSystem {


    public static void saveIt(Contact contact) throws IOException, ClassNotFoundException  {

        ArrayList<Contact> arr = new ArrayList<>();
        // read file first
        try {
            System.out.println("reading the file...");

             ObjectInputStream objectInputStream = openFile();
              arr = (ArrayList<Contact>) objectInputStream.readObject();

          }
        catch (Exception e) {
            System.out.println("File empty");
        }
        finally {
            System.out.println("continue...");

            // add contact to the end of Array
            arr.add(contact);
            // save file
            FileOutputStream fileOutputStream = new FileOutputStream("db.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(arr);
            System.out.println("Stored");
        }
    }

    public static ObjectInputStream openFile() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("db.txt");
        return new ObjectInputStream(fileInputStream);
    }

    public static ArrayList<Contact> readFile() throws IOException, ClassNotFoundException {

        return (ArrayList<Contact>) openFile().readObject();
    }




}



