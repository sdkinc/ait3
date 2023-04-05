import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        int[] arr= new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=(int)(Math.random() * (100 - 10 + 1) + 10);

        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Please input your chose number");
        String numStr=br.readLine();
        int num = Integer.parseInt(numStr);
        boolean isFind=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==num){
                System.out.println("This is your choise:"+arr[i] +" on index "+i);
                isFind=true;
                break;
            }
        }
        if (isFind!=true){
            System.out.println("Your number we can't find in this array");
        }
        */

        /*
        int[] array = {46, 13, 1, 10, 67, -4, 20, 56, 11, 35};
        System.out.println(Arrays.toString(array));
        int temp;
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
         */
        /*
        double[] array = new double[20];
        for (int i = 0; i < 20; i++) {
            array[i]= (double)(int)(Math.random() * (100000000 - 10000 + 1) + 10000);
        }
        System.out.println(Arrays.toString(array));
        for (int i = 0; i < array.length; i++) {
            array[i]=array[i]/100;
        }
        System.out.println(Arrays.toString(array));
        */

        /*
        //Дано натуральное число n меньшее 10. Напишите программу, которая выводит таблицу умножения на n.
        System.out.println("PLease input num in range 0-10");
        String numStr = br.readLine();
        int num = Integer.parseInt(numStr);
        for (int i = 1; i <11; i++) {
            System.out.println(""+num +"*"+i +" = "+num*i);
        }
         */

        System.out.println((int)(Math.random() * (36 - 1 + 1) + 1));
    }
}