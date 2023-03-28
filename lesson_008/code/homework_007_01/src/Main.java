import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello world!");

        int a;
        int b;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число а: ");
        String aStr = bufferedReader.readLine();
        System.out.println("Введите число b: ");
        String bStr = bufferedReader.readLine();
        a = Integer.parseInt(aStr);
        b = Integer.parseInt(bStr);
        int sum;
        if (a==b){
            sum = 2*(a+b);
        }
        else {
            sum = a+b;
        }
        System.out.println("Сумма составила "+sum + ", т.к. значение равенства a==b равно "+(a==b));
    }
}