import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  // Написать метод
  //
  // public static String decToBin(int number)
  //
  // который получит число и вернёт строку с его двоичной записью.
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    System.out.print("Введите целое число: ");
    int number = Integer.parseInt(bufferedReader.readLine());

    String binNumberStr = decToBin(number);
    System.out.println("Число " + number + " в системе счисления с основанием 2: " + binNumberStr);
  }

  public static String decToBin(int number) {
    if (number == 0) {
      return "0";
    }

    StringBuilder result = new StringBuilder();
    boolean isNegative = number < 0;
    if (isNegative) {
      number = Math.abs(number);
    }

    while (number > 0) {
      result.insert(0, number % 2);
      number /= 2;
    }
    if (isNegative) {
      result.insert(0, "-");
    }

    return result.toString();
  }
}
