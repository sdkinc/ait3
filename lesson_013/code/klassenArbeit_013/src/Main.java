import java.io.*;
public class Main {
    public static void main(String[] args) throws Exception {

        //Задача 1. Вводится натуральное число. Напечатать, из каких цифр оно состоит.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input number");
        String numStr = br.readLine();
        int num1 = Integer.parseInt(numStr);
        int i = 0;

        while (i<numStr.length()){
            System.out.println("As string: "+numStr.charAt(i));
            i++;
        }
        int b=0;
        while (num1 > 0){
            System.out.println("As number: "+num1%10);
            num1 /=10;
            b++;
        }

        //Задача 2. Вводится слово с клавиатуры. Напечатаь, каждую букву слова с новой строки.
        System.out.println("Input string");
        String someStr = br.readLine();
        i = 0;
        while (i<someStr.length()){
            System.out.println("Letter from someStr: "+someStr.charAt(i));
            i++;
        }

        //Задача 3. Дано целое число, не меньшее 2. Выведите его наименьший натуральный делитель, отличный от 1.
        System.out.println("Input number less than 2");
        numStr = br.readLine();
        num1 = Integer.parseInt(numStr);
        i=2;
        boolean resultDone = false;
        while (i<num1 & !resultDone){
            if(num1%i==0){
                System.out.println("Minimal natural divider is: "+i);
                resultDone = true;
            }
            i++;
        }
    }
}