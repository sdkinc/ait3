import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strIn = br.readLine();
        System.out.println(strIn);
        return;
        /*
        int currentNum = 1;
        int lastNum = 1;
        int temp;
        System.out.println("index " + 1 + ":num " + lastNum);
        System.out.println("index " + 2 + ":num " + currentNum);
        for (int i = 3; i < 20; i++) {
            temp = calcFibonacci(lastNum, currentNum);
            lastNum = currentNum;
            currentNum = temp;
            System.out.println("index " + i + ":num " + currentNum);
        }
         */
    }

    public static int calcFibonacci(int a, int b) {
        return (a + b);
    }
}