import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
            Задача 1. Написать программу, которая:
            прочитает с клавиатуры количество вводимых названий земель в Германии,
            прочитает с клавиатуры названия земель и соберёт их в множество,
            выведет полученные результаты на экран.
         */
        /*
        int countLandes = inputPositiveIntNumber("of count Bundeslandes in DE");
        HashSet<String> bundesLandes = new HashSet<String>();
        String nameOfOneLand = "";
        while (true) {
            nameOfOneLand = inputName("of one Bundesland");
            bundesLandes.add(nameOfOneLand);
            if (bundesLandes.size() == countLandes) {
                break;
            }
        }
        System.out.println(bundesLandes);
         */

        /*
            Задача 2. Написать программу, которая:
            прочитает с клавиатуры количество вводимых чисел, прочитает с клавиатуры сами числа и соберёт их в множество,
            удалить из множества числа, большие 10 (здесь надо подумать!) выведет полученные результаты на экран Все числа, которые подаются на вход, целые.
         */

        int countNumbers = inputPositiveIntNumber("count if numbers");
        HashSet<Integer> myNumbers = new HashSet<Integer>();
        for (int i = 0; i < countNumbers; i++) {
            myNumbers.add(inputPositiveIntNumber("Some number in range 5-15, or not)"));
        }
        System.out.println(myNumbers);

        HashSet<Integer> myNumbersOut = new HashSet<Integer>();
        for (int i : myNumbers)
            if (i <= 10) {
                myNumbersOut.add(i);
            }
        System.out.println(myNumbersOut);
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

    public static String inputName(String m) {
        Scanner scanner = new Scanner(System.in);
        String inputName = "";
        System.out.println("Input name " + m + ": ");
        inputName = scanner.nextLine();
        while (!inputName.matches("[a-zA-Z]+")) {
            System.out.println("Invalid name. Please try again");
            inputName = scanner.nextLine();
        }
        return inputName;
    }
}