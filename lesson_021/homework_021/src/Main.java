import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ArrList HW");
        /*
        Задача 4 ().* Заполните массив/список из 100 элементов случайными числами от 1 до 10. Посчитайте, сколько в нем
        получилось пар элементов, равных друг другу. Считается, что любые два элемента, равные друг другу образуют одну
        пару, которую необходимо посчитать.
         */
        int[] array = new int[100];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
        }
        System.out.println(Arrays.toString(array));
        ArrayList<Integer> myArrList = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            myArrList.add(i, 0);
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    myArrList.set(array[i], myArrList.get(array[i]) + 1);
                }
            }
        }
        System.out.println(myArrList);
    }
}