import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TaskPhonebook {

    private static final String SEP = ",";
    public static final String PHONEBOOK_FILE = "res/phonebook.csv";

    public static void main(String[] args) throws IOException {
        HashMap<String, String> phones = new HashMap<>();
        File phonebookFile = new File("res/phonebook.csv");
        if (phonebookFile.exists()) {
            Scanner scanner = new Scanner(phonebookFile);
            while (scanner.hasNext()) {
                String line = scanner.nextLine();
                if (!line.isEmpty()) {
                    int sepIndex = line.indexOf(SEP);
                    if (sepIndex != -1) {
                        String name = line.substring(0, sepIndex);
                        String phone = line.substring(sepIndex + 1);
                        phones.put(name, phone);
                    }
                }
            }
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.nextLine();
        System.out.println("Input phone:");
        String phone = scanner.nextLine();
        phones.put(name, phone);
        for (String owner : phones.keySet()) {
            System.out.println(owner + " " + phones.get(owner));
        }

        FileWriter fileWriter = new FileWriter(PHONEBOOK_FILE);

    }
}
