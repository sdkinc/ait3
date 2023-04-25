import java.util.Scanner;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("Phone book!");
        int userChoise = 0;
        Scanner scanner = new Scanner(System.in);
        HashMap<String, String> phoneBook = new HashMap<>();
        do {
            printMenu("Привет");
            printMenu("Привет номер два");
            userChoise = scanner.nextInt();
            switch (userChoise) {
                case 1: {
                    //add record
                    addContact(phoneBook);
                    break;
                }
                case 2: {
                    printPhoneBook(phoneBook);
                    break;
                }
                case 3: {
                    searchPhoneBook(phoneBook);
                    break;
                }
                case 4: {

                    break;
                }
                case 5: {

                    return;
                }
            }
        } while (true);
    }

    // Methods
    public static void printMenu(String txt) {
        System.out.println(txt);
        System.out.println("1 - add, 2 - show. 3 - find, 4 - delete, 5 - exit");
        System.out.println("Input your choise:");
    }

    public static void addContact(HashMap<String, String> contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.next();
        System.out.println("Input phone number:");
        String phone = scanner.next();
        contacts.put(name, phone);
    }

    public static void printPhoneBook(HashMap<String, String> contacts) {
        for (String name : contacts.keySet()) {
            System.out.println("Name: " + name + ", phone: " + contacts.get(name));
        }
    }

    public static void searchPhoneBook(HashMap<String, String> contacts) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input name:");
        String name = scanner.next();
        if (contacts.containsKey(name)) {
            System.out.println("Name: " + name + ", phone: " + contacts.get(name));
        } else {
            System.out.println("Name not found" + contacts.get(name));
        }

    }
    // End of methods
}