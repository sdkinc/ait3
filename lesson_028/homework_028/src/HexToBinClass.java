import java.io.BufferedReader;
import java.io.InputStreamReader;

public class HexToBinClass {

  private static final int RADIX = 16;
  private static final int SHIFT = 55;//Increment to convert dec 11 to hex B (11+INC)

  public static void main(String[] args) throws Exception {
    //Задача 3* (не обязательно)
    //Написать свою версию метода
    //public static String decToHex(int number)
    //из классной работы с использованием кодов символов (и знанием того, что
    // символы A-F в таблице символов идут подряд).
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Please input some integer number.");
    try {
      int number = Integer.parseInt(br.readLine());
      System.out.println("Dec " + number + " as hex is " + decToHex(number));
    } catch (NumberFormatException e) {
      System.out.println("Mismatch format of integer: " + e.getMessage());
    }
  }

  public static String decToHex(int number) {
    String bin = "";
    boolean isNegative = number != Math.abs(number);
    number = Math.abs(number); // для целей деления и перебора чисел убрали знак
    while (number != 0) { // пока в числе есть цифры
      int digit = number % RADIX; // последняя цифра - остаток от деления на основание (10)
      String digitStr = ((digit > 9) ? String.valueOf((char) (digit + SHIFT))
          : ""
              + digit); // для числа больше 9 пересчитаем соответствующее значение в буквенном эквиваленте
      bin = digitStr + bin;
      // убираем последнюю цифру, находим целую часть от деления на основание
      number /= RADIX; // number = number / RADIX; // +=, -=, *=, /=
    }
    return isNegative ? "-" + bin : bin;
  }
}
