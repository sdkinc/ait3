import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task2 {

  private static final int RADIX = 10;

  public static void main(String[] args) throws Exception {
    //Задача 2
    //Написать метод
    //public static int maxDecDigit(int number)
    //который получит число и вернёт максимальную цифру этого числа.
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please input some integer number.");
    try {
      int number = Integer.parseInt(br.readLine());
      System.out.println("Max dec digit in a " + number + " is " + maxDecDigit(number));
    } catch (NumberFormatException e) {
      System.out.println("Неправильный формат целого числа: " + e.getMessage());
    }
  }

  public static int maxDecDigit(int number) {
    int dec = 0;
    int[] numberArray = new int[10];
    for (int i = 0; i < numberArray.length; i++) {
      numberArray[i] = -1;
    }
    number = Math.abs(number); // для целей деления и перебора чисел убрали знак
    while (number != 0) { // пока в числе есть цифры
      int digit = number % RADIX; // последняя цифра - остаток от деления на основание (10)
      numberArray[digit] = 1;
      // убираем последнюю цифру, находим целую часть от деления на основание
      number /= RADIX; // number = number / RADIX; // +=, -=, *=, /=
    }
    for (int i = 9; i > 0; i--) {
      if (numberArray[i] != -1) {
        dec = i;
        break;
      }
    }
    return dec;
  }
}
