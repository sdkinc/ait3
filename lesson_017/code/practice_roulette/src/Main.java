import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        /*
         Задача 6 Запустить "Рулетку" 20 раз.
         В "Рулетке" на круге 36 ячеек, куда может попасть шарик,
         и два цвета - красный, черный.
         Результат попытки вывести так: "Выиграл номер NN, четное или нечетное, цвет".

        String[] colors = {"green",
                "red", "black", "red", "black", "red", "black", "red", "black", "red", "black",
                "black", "red", "black", "red", "black", "red", "black", "red", "red", "black",
                "red", "black", "red", "black", "red", "black", "red", "black", "black", "red",
                "black", "red", "black", "red", "black", "red"};
        int ball;
        for (int i = 0; i < 20; i++) {
            ball = (int) (Math.random() * (36 + 1) + 0);
            if (ball == 0) {
                System.out.println("Winning number is green Zero");
            } else {
                System.out.println("Winning number is " + ball + " colour " + colors[ball] + ". number is " + (ball % 2 == 0 ? "even" : "odd"));
            }
        }
        */
        /*
        Задача 8. Имитация броска 2-мя кубиками с 6 гранями. Использовать двухмерный массив.
         */
        /*
        int[][] myArray = new int[10][2];
        for (int i = 0; i < 10; i++) {
            myArray[i][0] = (int) (Math.random() * (6 - 1 + 1) + 1);
            myArray[i][1] = (int) (Math.random() * (6 - 1 + 1) + 1);
            System.out.println(Arrays.toString(myArray[i]));
        }

         */


        /* Задача 4 ().* Вывести на экран таблицу квадратов натуральных чисел от 1 до 99

         */
        /*
        double[][] myArray = new double[10][10];
        String cell = "";
        System.out.print("    |");
        for (int i = 0; i < myArray.length; i++) {
            cell = "       " + i;
            cell = cell.substring(cell.length() - 6);
            if (i == 9) {
                System.out.println("" + cell + "|");
            } else {
                System.out.print("" + cell + "\t|");
            }
        }

        for (int i = 0; i < myArray.length; i++) {
            System.out.print(i);
            cell = "      " + i;
            cell = cell.substring(cell.length() - 6);
            for (int j = 0; j < myArray.length; j++) {
                myArray[i][j] = Math.pow((i * 10 + j), 2);
                cell = "      " + (int) myArray[i][j];
                cell = cell.substring(cell.length() - 6);
                System.out.print("\t|" + cell);
            }
            System.out.println("|");
        }

         */


        Random rand = new Random();
        int[][] rolls = new int[10][2];
        for (int i = 0; i < 10; i++) {
            rolls[i][0] = rand.nextInt(6) + 1;
            rolls[i][1] = rand.nextInt(6) + 1;
        }
        System.out.println("Результаты бросков:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Бросок " + (i + 1) + ": " + rolls[i][0] + ", " + rolls[i][1]);
        }

    }
}