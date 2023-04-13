import java.util.Arrays;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        //Задача 2. Напишите программу, которая запрашивет N имен учащихся группы и выводит список имен в столбик.
        // N запрашивется с клавиатуры, имена вносятся в массив для последующей сортировки по алфавиту.
        // Программа должна быть защищена от ввода чисел вместо имен.
        try {
            int a = 1 / 0;
        } catch (NumberFormatException ex) {
            System.out.println("Miss catch");
        } finally {
            System.out.println("Finally");
        }

        System.out.println("{{{Finally}}}");
    }

    public static String inputName(String m) {
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

    public static int inputPositiveIntNumber(String m) {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = "";
        System.out.println("Input number " + m + ": ");
        inputNumber = scanner.nextLine();
        while (1 == 1) {
            try {
                while (!inputNumber.matches("[0-9]+") || Integer.parseInt(inputNumber) <= 0) {
                    System.out.println("Invalid number, pls try again.");
                    inputNumber = scanner.nextLine();
                }
            } catch (NumberFormatException ex) {
                System.out.println("Number is too big, pls try again");
                inputNumber = scanner.nextLine();
                continue;
            }
            return Integer.parseInt(inputNumber);
        }
    }
}