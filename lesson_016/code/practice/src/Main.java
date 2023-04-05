import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача 1. Задан массив целых чисел: 56, 73, 15, -10, 37, -14, 25, 65, 33, 38.
        // Найдите максимальный элемент массива и его индекс.
        int[] arr = {56, 73, 15, -10, 37, -14, 25, 65, 33, 38};
        int temp = -999999;
        int pointer = -1;
        for (int j = 0; j < arr.length; j++) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] > temp) {
                    temp = arr[i];
                    pointer = i;
                }
            }
        }
        System.out.println("Maximal value of array is " + temp + " at index " + pointer);
        //Maximal value of array is 999 at index 9

        //Задача 2. Создайте массив из 20 случайных целых чисел в интервале от 10 до 20.
        // Выведите массив на печать. Поменяйте местами первый и последний
        // элементы массива и снова выведите массив на печать.
        int[] arr20 = new int[20];
        for (int i = 0; i < 20; i++) {
            arr20[i] = (int) (Math.random() * (20 - 10 + 1) + 10);
        }
        System.out.println(Arrays.toString(arr20));
        int temp20 = arr20[0];
        arr20[0] = arr20[arr20.length - 1];
        arr20[arr20.length - 1] = temp20;
        System.out.println(Arrays.toString(arr20));
        /*
        [10, 13, 13, 11, 10, 18, 17, 12, 12, 18, 15, 17, 13, 16, 11, 20, 12, 19, 16, 11]
        [11, 13, 13, 11, 10, 18, 17, 12, 12, 18, 15, 17, 13, 16, 11, 20, 12, 19, 16, 10]
         */

        //Задача 3 ().* Напечатать таблицу умножения для чисел от 1 до 9.
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print("\t" + i * j);
            }
            System.out.println("");
        }
        /*
            1	2	3	4	5	6	7	8	9
            2	4	6	8	10	12	14	16	18
            3	6	9	12	15	18	21	24	27
            4	8	12	16	20	24	28	32	36
            5	10	15	20	25	30	35	40	45
            6	12	18	24	30	36	42	48	54
            7	14	21	28	35	42	49	56	63
            8	16	24	32	40	48	56	64	72
            9	18	27	36	45	54	63	72	81
         */

        //Задача 4 ().* Заполнить двухмерный массив 8 х 8 элементами 0 и 1,
        // как на шахматной достке. 1 - черное поле, 0 - белое поле Вывести массив на печать.
        int num = 1;
        System.out.println("\t*\t|\tA\tB\tC\tD\tE\tF\tG\tH");
        System.out.println("\t-\t|\t-\t-\t-\t-\t-\t-\t-\t-");
        for (int i = 1; i <= 8; i++) {
            System.out.print("\t" + i + "\t|");
            for (int j = 1; j <= 8; j++) {
                if ((num + i) % 2 == 0) {
                    System.out.print("\t" + 1);
                } else {
                    System.out.print("\t" + 0);
                }
                num++;
            }
            System.out.println("");
        }
        /*
            *	|	A	B	C	D	E	F	G	H
            -	|	-	-	-	-	-	-	-	-
            1	|	1	0	1	0	1	0	1	0
            2	|	0	1	0	1	0	1	0	1
            3	|	1	0	1	0	1	0	1	0
            4	|	0	1	0	1	0	1	0	1
            5	|	1	0	1	0	1	0	1	0
            6	|	0	1	0	1	0	1	0	1
            7	|	1	0	1	0	1	0	1	0
            8	|	0	1	0	1	0	1	0	1
         */

    }
}
