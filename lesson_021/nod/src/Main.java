import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("NOD");
        int a = inputPositiveIntNumber(" a (first)");
        int b = inputPositiveIntNumber(" b (second)");
        int temp = 1;
        for (int i = 2; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                temp = i;
            }
        }
        System.out.println(temp);
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