import java.util.*;

public class Main{
    public static void main(String[] args) throws Exception {
        ArrayList<Client> list = FileManager.getList();
        new GraphicalUserInterface(list);
    }
}