import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

  private static final int RADIX = 2;

  public static void main(String[] args) throws Exception {
    //Задача 1
    //Написать метод
    //public static String decToBin(int number)
    //который получит число и вернёт строку с его двоичной записью.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please input some integer number.");
    try {
      int number = Integer.parseInt(br.readLine());
      System.out.println("Dec " + number + " as bin is " + decToBin(number));
    } catch (NumberFormatException e) {
      System.out.println("Неправильный формат целого числа: " + e.getMessage());
    }
  }

  public static String decToBin(int number) {
    String bin = "";
    boolean isNegative = (number == Math.abs(number)) ? false : true;
    number = Math.abs(number); // для целей деления и перебора чисел убрали знак
    while (number != 0) { // пока в числе есть цифры
      int digit = number % RADIX; // последняя цифра - остаток от деления на основание (10)
      bin = digit + bin;
      // убираем последнюю цифру, находим целую часть от деления на основание
      number /= RADIX; // number = number / RADIX; // +=, -=, *=, /=
    }
    return isNegative ? "-" + bin : bin;
  }
}
