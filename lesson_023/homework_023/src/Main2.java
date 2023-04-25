import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        /*
        Задача 3 (*). Соберите в HashSet не менее 10 наименований национальных валют (EUR, USD и т.д).
        Наименования валют можно задать внутри програмы. Выведите список валют на экран.
        Придумайте способ, которым пользователь выбирает желаемую валюту и узнает ее текущий курс к евро.
         */
        HashSet<String> currencies = new HashSet<String>();
        currencies.add("USD\t840\tДоллар США");
        currencies.add("EUR\t978\tЕвро");
        currencies.add("GBP\t826\tФунт стерлингов Велико\u00ADбритании");
        currencies.add("JPY\t392\tЯпонская йена");
        currencies.add("CHF\t756\tШвейцарский франк");
        currencies.add("CNY\t156\tКитайский юань женьминьби");
        currencies.add("AED\t784\tДирхам ОАЭ");
        currencies.add("AFN\t971\tАфганский афгани");
        currencies.add("ALL\t008\tАлбанский лек");
        currencies.add("AMD\t051\tАрмянский драм");
        for (String i : currencies) {
            System.out.println(i);
        }
        String codeCurrencies = inputString("of currencies please");
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

    public static String inputString(String m) {
        Scanner scanner = new Scanner(System.in);
        String inputName = "";
        System.out.println("Input name " + m + ": ");
        inputName = scanner.nextLine();
        while (!inputName.matches("[a-zA-Z0-9]+")) {
            System.out.println("Invalid name. Please try again");
            inputName = scanner.nextLine();
        }
        return inputName;
    }
}