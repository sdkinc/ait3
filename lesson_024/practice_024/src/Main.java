import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Remove negative numbers from set");
        //        Написать программу, которая:
        //        - прочитает с клавиатуры количество вводимых чисел,
        //        - прочитает с клавиатуры сами числа и соберёт их в множество,
        //        - удалит из множества числа, большие 10 (здесь надо подумать!)
        //        выведет полученные результаты на экран
        //        Все числа, которые подаются на вход, целые.
        int numElements = inputIntNumber("size of set");
        System.out.println(numElements);
        HashSet<Integer> numbers = new HashSet<Integer>();
        HashSet<Integer> numbersToRemove = new HashSet<Integer>();
        for (int i = 0; i < numElements; i++) {
            numbers.add(inputIntNumber("element value"));
        }
        for (int i : numbers) {
            if (i > 10) {
                numbersToRemove.add(i);
            }
        }
        System.out.println(numbers);

    }

    public static int inputIntNumber(String m) {
        Scanner scanner = new Scanner(System.in);
        String inputNumber = "";
        System.out.println("Input number " + m + ": ");
        inputNumber = scanner.nextLine();
        while (1 == 1) {
            try {
                while (!inputNumber.matches("[0-9]+")) {
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