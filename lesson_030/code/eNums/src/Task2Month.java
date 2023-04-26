import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task2Month {
        public static void main(String[] args) {
            Map<Month, Integer> daysPerMonth = new HashMap<>();
            daysPerMonth.put(Month.JANUARY, 31);
            daysPerMonth.put(Month.FEBRUARY, 28); // год не високосный
            daysPerMonth.put(Month.MARCH, 31);
            daysPerMonth.put(Month.APRIL, 30);
            daysPerMonth.put(Month.MAY, 31);
            daysPerMonth.put(Month.JUNE, 30);
            daysPerMonth.put(Month.JULY, 31);
            daysPerMonth.put(Month.AUGUST, 31);
            daysPerMonth.put(Month.SEPTEMBER, 30);
            daysPerMonth.put(Month.OCTOBER, 31);
            daysPerMonth.put(Month.NOVEMBER, 30);
            daysPerMonth.put(Month.DECEMBER, 31);

            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the month: ");
            String month = scanner.next(); // месяц "как ввели"
            Month monthKey = Month.valueOf(month.toUpperCase()); // месяц "как ключ словаря"
            if (daysPerMonth.containsKey(monthKey)) {
                System.out.println(month + " has " + daysPerMonth.get(monthKey) + " days");
            } else {
                System.out.println("We know nothing about " + month);
            }
            System.out.println();

            System.out.println("=== Перебор через keySet() ===");
            for (Month key : Month.values()) {
                // перебираем ключи, по каждому ключу получаем значение через get
                System.out.println(key + ": " + daysPerMonth.get(key));
            }
            System.out.println();

        }


    private enum Month{
        JANUARY,
        FEBRUARY,
        MARCH,
        APRIL,
        MAY,
        JUNE,
        JULY,
        AUGUST,
        SEPTEMBER,
        OCTOBER,
        NOVEMBER,
        DECEMBER,
    }
}