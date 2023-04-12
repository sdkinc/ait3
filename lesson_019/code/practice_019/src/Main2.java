import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        System.out.println("Input string and number only");

        Scanner scanner = new Scanner(System.in);

        String name = inputName();
        System.out.println("Hello " + name);


        int num = inputNumber();
        System.out.println("Number is " + num);
    }

    //Methods

    public static String inputName() {
        Scanner scanner = new Scanner(System.in);
        String inputName = "";
        System.out.println("Input your name:");
        inputName = scanner.nextLine();
        while (!inputName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name. Please try again");
            inputName = scanner.nextLine();
        }
        return inputName;
    }

    public static int inputNumber() {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = "";
        System.out.println("Input number: ");
        inputNumber = scanner.nextLine();
        while (!inputNumber.matches("[0-9]+")) {
            System.out.println("Invalid number, pls try again.");
            inputNumber = scanner.nextLine();
        }
        return Integer.parseInt(inputNumber);
    }
}

