import java.io.*;
import java.util.*;

public class FileManager {
    
    static ArrayList<Client> getList() throws Exception {

        File file_checker = new File("DATA.txt");

        if (file_checker.exists()) {
            System.out.println("File already exists");
        } else {
            file_checker.createNewFile();

            ArrayList<Client> DATA = new ArrayList<>();

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file_checker));
            oos.writeObject(DATA);
            oos.close();

            System.out.println("File created");

        }

        ArrayList<Client> DATA;

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Data.txt"));
        DATA = (ArrayList<Client>) ois.readObject();
        ois.close();

        return DATA;
    }

    static void saveList(ArrayList<Client> DATA) throws Exception {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("DATA.txt"));
        oos.writeObject(DATA);
        oos.close();
    }

}
