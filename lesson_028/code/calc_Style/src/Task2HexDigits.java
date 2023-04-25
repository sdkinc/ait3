import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2HexDigits {

  private static final int RADIX = 16;

  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please input some number");
    try {
      int number = Integer.parseInt(br.readLine());
      printHexDigits(number);
    } catch (NumberFormatException e) {
      System.out.println("Uncorrect format of int" + e.getMessage());
    }
  }

  private static void printHexDigits(int number) {
    int order = 0;
    System.out.println("Numbers " + number + ":");
    while (number > 0) {
      int digit = number % RADIX;
      String digitStr = Integer.toString(digit);
      switch (digit) {
        case 10:
          digitStr = "A";
          break;
        case 11:
          digitStr = "B";
          break;
        case 12:
          digitStr = "C";
          break;
        case 13:
          digitStr = "D";
          break;
        case 14:
          digitStr = "E";
          break;
        case 15:
          digitStr = "F";
          break;
        default:
          digitStr = Integer.toString(digit);
          break;
      }
      System.out.println(digitStr + " range=" + order);
      number /= RADIX;
      order++;
    }
  }
}
