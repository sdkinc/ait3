import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Task_hw_2MonthEnum {
    private enum Month {
        JANUARY, // 0
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

    private enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN,
    }

    public static void main(String[] args) throws IOException {
        Map<Month, Integer> daysPerMonth = readDaysPerMountFromFile();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the month: ");
        String month = scanner.next(); // месяц "как ввели"
        // enum.valueOf("ЗНАЧЕНИЕ") либо вернёт нам соответствующее значение по его названию,
        // либо выбросит исключение IllegalArgumentException
        Month monthKey = Month.valueOf(month.toUpperCase()); // месяц "как ключ словаря"
        // enum.ordinal() возвращает индекс значения в перечислении
        System.out.println(month + " has " + daysPerMonth.get(monthKey) + " days");
        // 0 -> 1, 1 -> 2, ..., 11 -> 12 % 12 = 0
        int nextMonthIndex = (monthKey.ordinal() + 1) % Month.values().length;
        Month nextMonth = Month.values()[nextMonthIndex];
        System.out.println(
                "The next month " + nextMonth + " has " + daysPerMonth.get(nextMonth) + " days");
        System.out.println();

        System.out.print("Enter the month number: ");
        int monthNumber = scanner.nextInt(); // порядковый номер месяца
        // enum.valueOf("ЗНАЧЕНИЕ") либо вернёт нам соответствующее значение по его названию,
        // либо выбросит исключение IllegalArgumentException
        int monthIndex = monthNumber - 1; // индекс месяца в перечислении
        monthKey = Month.values()[monthIndex]; // месяц "как ключ словаря"
        int seasonIndex = monthNumber / 3;//если взять номер месяца и нацело поделить на 3, то
        //мы получим индекс номера года из второго перечисления
        Season seasonKey = Season.values()[seasonIndex]; // время года "как ключ словаря"
        // при выводе вызовется enum.toString(), который выдаст название значения в виде строки
        String seasonName = seasonKey.toString();// время года "как строковое представление ключа"
        int dayInSelectedMonth = daysPerMonth.get(monthKey);
        System.out.println(monthKey + " has " + dayInSelectedMonth + " days and season's name is " + seasonName);
        System.out.println();
    }

    private static Map<Month, Integer> readDaysPerMountFromFile() throws IOException {
        Map<Month, Integer> monthInMethod = new HashMap<>();
        BufferedReader br = new BufferedReader(new FileReader("res/months.csv"));
        String monthAndDay = br.readLine();//читаем строку из файла
        while (monthAndDay != null) {
            String monthName = monthAndDay.substring(0, monthAndDay.indexOf(","));//парсим наименование месяца
            String dayCountStr = monthAndDay.substring(monthAndDay.indexOf(",") + 1);
            int dayCount = Integer.parseInt(dayCountStr);//парсим кво дней
            Month monthKey = Month.valueOf(monthName.toUpperCase()); // месяц "как ключ словаря"
            monthInMethod.put(monthKey, dayCount); //вставляем пару ключ значение в мапу
            monthAndDay = br.readLine();//читаем следующую строку
        }
        br.close();//закрываем ридер
        return monthInMethod;//возвращаем созданную и заполненную мапу
    }
}

