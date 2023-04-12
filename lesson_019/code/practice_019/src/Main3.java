import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        System.out.println("Arithmetic operations -+*/");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            int a = inputNumber();
            int b = inputNumber();

            System.out.println("Choise operation 1 sum 2 substraction 3 multi 4 division");
            int operation = scanner.nextInt();

            switch (operation) {
                case 1: {
                    int res = sum(a, b);
                    System.out.println("Sum is " + res);
                    break;
                }
                case 2: {
                    int res = substraction(a, b);
                    System.out.println("Subst is " + res);
                    break;
                }
                case 3: {
                    int res = multiplication(a, b);
                    System.out.println("Mult is " + res);
                    break;
                }
                case 4: {
                    int res = division(a, b);
                    System.out.println("Div is " + res);
                    break;
                }
                default: {
                    System.out.println("Operation isn't recognized");
                }
            }
            System.out.println("Retry? y/n");
            String choise = "";
            choise = scanner.nextLine();
            if (choise.equalsIgnoreCase("y")) {
                System.out.println("See you later!");
                break;// exit out from loop without end.
            }
        }
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int substraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
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
