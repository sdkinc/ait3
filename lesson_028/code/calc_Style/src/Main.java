import java.io.BufferedReader;
import java.io.InputStreamReader;
import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Please input some number");
    try {

      int number = Integer.parseInt(br.readLine());
      printDigits(number);
    } catch (NumberFormatException e) {
      System.out.println("Uncorrect format of int" + e.getMessage());
    }
  }

  private static void printDigits(int number) {
    int order = 0;
    System.out.println("Numbers " + number + ":");
    while (number > 0) {
      int digit = number % 10;
      System.out.println(digit + " range=" + order);
      number /= 10;
      order++;
    }
  }
}


/*
101 1111
0101 1111
5 F
5F
 */