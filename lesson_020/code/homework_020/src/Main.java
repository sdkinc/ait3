import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Задача 2. Напишите программу, которая запрашивет N имен учащихся группы и выводит список имен в столбик.
        // N запрашивется с клавиатуры, имена вносятся в массив для последующей сортировки по алфавиту.
        // Программа должна быть защищена от ввода чисел вместо имен.
        int a = inputPositiveIntNumber("as length of array");
        String[] array = new String[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = inputName("Record No:" + (i + 1));
        }
        System.out.println("\nUnsorted\n________________");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "\t" + array[i]);
        }
        Arrays.sort(array);
        System.out.println("\nSorted\n________________");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "\t" + array[i]);
        }
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