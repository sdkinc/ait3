import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class TaskPhonebookHW {

    private static final String SEP = ",";
    private static final File PHONEBOOK_FILE = new File("res/phonebook.csv");

    public static void main(String[] args) {
        HashMap<String, String> phones = new HashMap<>(); // пары "имя" - "номер телефона"
        // CSV - comma-separated value - значения, разделённые запятыми
        readExistingRecordsFromFile(phones);//чтение существующего файла в хешмапу
        addRecordToHashMap(phones);//добавление записи в хешмапу из пользовательского ввода
        for (String owner : phones.keySet()) { //печать хешмапы
            System.out.println(owner + ": " + phones.get(owner));
        }
        saveAllRecordToFile(phones);//сохранение хешмапы в файл
    }

    //-->>Methods
    public static void saveAllRecordToFile(HashMap<String, String> phonesToSave) {
        try {
            FileWriter fileWriter = new FileWriter(PHONEBOOK_FILE);
            for (String owner : phonesToSave.keySet()) {
                fileWriter.write(owner + SEP + phonesToSave.get(owner) + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Cannot modify file." + e.getMessage());
        }
    }

    public static void addRecordToHashMap(HashMap<String, String> phonesToSave) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона:");
        String phone = scanner.nextLine();
        phonesToSave.put(name, phone);
    }

    public static void readExistingRecordsFromFile(HashMap<String, String> phonesToSave) {
        try {
            if (PHONEBOOK_FILE.exists()) {
                Scanner scanner = new Scanner(PHONEBOOK_FILE);
                while (scanner.hasNext()) {
                    String line = scanner.nextLine();
                    if (!line.isEmpty()) {
                        int sepIndex = line.indexOf(SEP);
                        if (sepIndex != -1) {
                            String name = line.substring(0, sepIndex);
                            String phone = line.substring(sepIndex + 1);
                            phonesToSave.put(name, phone);
                        }
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Cannot read from file:" + e.getMessage());
        }
    }
    //--<<Methods
}
