import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main1 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello world!");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String strIn = br.readLine();
        System.out.println(strIn);
    }
}