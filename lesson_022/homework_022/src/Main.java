import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Амеба");
        int hours = inputPositiveIntNumber("of hours to remaining");//Спрашиваем у пользователя количество часов.
        int hours2large = hours / 3;//Получаем количество циклов деления амеб
        int am = (int) Math.pow(2, hours2large);//Возводим 2 в степеь равную количеству циклов на предыдущем шаге
        System.out.println("In " + hours + " it was " + am + " microorganismus");//Выводим результат.

        System.out.println("Монетки");
        int numbersCoin = inputPositiveIntNumber("of coins on a table");//Спрашиваем у пользователя количество монеток.
        int[] coins = new int[numbersCoin];//Объявляем и произвольно заполняем массив
        for (int i = 0; i < numbersCoin; i++) {
            coins[i] = (int) (Math.random() * (1 - 0 + 1) + 0);
        }
        int count0 = 0;//Объявляем счетчики для 0 и 1 (орел и решка)
        int count1 = 0;
        int temp = 0;
        for (int i = 0; i < numbersCoin; i++) { //В цикле обходим весь массив и считаем количество соответственно орлов и решек
            temp = ((coins[i] == 0) ? count0++ : count1++);
        }
        System.out.println(Arrays.toString(coins));
        System.out.println("Min count of coins to turn over is " + ((count0 > count1) ? count1 : count0));


        System.out.println("Шоколад");
        int[] peopleAnswer = new int[10];
        for (int i = 0; i < peopleAnswer.length; i++) {
            peopleAnswer[i] = (int) (Math.random() * (2 - 1 + 1) + 1);
        }
        int countPositive = 0;
        for (int i = 0; i < peopleAnswer.length; i++) {
            if (peopleAnswer[i] == 1) {
                countPositive++;
            }
        }
        double percent = countPositive / 10.0D * 100;
        String percentString = String.format("%.2f", percent);
        System.out.println("It's a " + countPositive + " mans, who are positive. In percent it's " + percentString + "%");
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