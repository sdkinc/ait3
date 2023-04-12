import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Задача 1. Написать метод, определяющий максимум из трех натуральных чисел. Метод должен быть защищен от ввода отрицательных чисел.

        int num1 = inputIntPosNumber();
        int num2 = inputIntPosNumber();
        int num3 = inputIntPosNumber();
        int maxNum = getMaxOfThree(num1, num2, num3);
        System.out.println(maxNum);
         */

        //Задача 2. Написать метод, который находит площадь круга для любого заданного радиуса. Метод должен быть
        // защищен от ввода отрицательного числа и выводить результат с точностью до 3-х знаков
        // после десятичного разделителя.

        double square = getSquareOfCircle(inputDoublePosNumber(true));
        System.out.println(String.format("Square of circle is %.3f", square));


        //Задача 3 ().* Написать метод, который сортирует поданный на вход массив целых чисел в порядке
        // убывания (от большего к меньшему).

        int[] array = {1, 6, 9, -4, -199, 0, 44, -199};
        System.out.println(Arrays.toString(array));
        sortArray(array);
        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] arr) {
        int max, indexOfMAx; // можно объявить несколько переменных сразу

        for (int i = 0; i < arr.length; i++) { // проходим по массиву от его начала до конца (слева на право)
            max = arr[i];
            indexOfMAx = i;
            //пробегаем все элементы массива вправо от текущего
            for (int j = i; j < arr.length; j++) { // ищем минимальный элемент и его индекс
                if (arr[j] < max) {
                    max = arr[j]; // это минимальный
                    indexOfMAx = j; // это его индекс
                }
            }
            // делаем перестановку элементов
            int temp = arr[i]; // забрали в temp "левый крайний" элемент массива
            arr[i] = arr[indexOfMAx]; // на его место поставили найденный минимальный
            arr[indexOfMAx] = temp; // на место минимального поставили "левый крайний" элемент
        }
    }

    public static int getMaxOfThree(int a1, int a2, int a3) {
        if (a1 < 0 && a2 < 0 && a3 < 0) {
            System.out.println("Number must be greater than 0");
            return -1;
        }
        if (a1 > a2 & a1 > a3) {
            return a1;
        } else if (a3 > a2 & a3 > a2) {
            return a3;
        } else {
            return a2;
        }
    }

    // метод запрашивает натуральное число у пользователя
    public static int inputIntPosNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive integer number: ");
        int n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("The number can't be negative or 0. Pls, try again!");
            n = scanner.nextInt();
        }
        return n;
    }

    // метод запрашивает число типа дабл у пользователя используется булевый параметр только положительные.
    public static double inputDoublePosNumber(boolean pos) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input positive double number: ");
        double n = scanner.nextDouble();
        if (pos) {
            while (n <= 0) {
                System.out.println("The number can't be negative or 0. Pls, try again!");
                n = scanner.nextDouble();
            }
        }
        return n;
    }

    public static double getSquareOfCircle(double r) {
        if (r < 0) {
            System.out.println("Radius must be greater than 0");
            return -1;
        }
        return Math.PI * Math.pow(r, 2.);
    }


}