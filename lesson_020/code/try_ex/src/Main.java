import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example with div");

        Scanner scanner = new Scanner((System.in));
        System.out.println("Input a:");
        int a = scanner.nextInt();
        System.out.println("Input b:");
        int b = scanner.nextInt();
        int c = 0;
        try {
            c = division(a, b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(c);
    }

    public static int division(int a, int b) {
        return a / b;
    }
}