import java.io.IOException;
import java.io.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        System.out.println("Сейчас посчитаем площадь трапеции.\nДля этого выполните следующие действия");
        System.out.println("Введите длину первого основания (см): ");
        float line1 = Float.parseFloat(br.readLine());
        System.out.println("Введите длину второго основания (см): ");
        float line2 = Float.parseFloat(br.readLine());
        System.out.println("Введите длину высоты (см): ");
        float height1 = Float.parseFloat(br.readLine());
        char chSquare = 178;
        System.out.println("Площадь трапеции составляет: " + ((line1 + line2) / 2 * height1) + "см" + chSquare);

        System.out.println("Сейчас посчитаем площадь прямоугольника.\nДля этого выполните следующие действия");
        System.out.println("Введите длину одной стороны (см): ");
        float side1 = Float.parseFloat(br.readLine());
        System.out.println("Введите длину второй стороны (см): ");
        float side2 = Float.parseFloat(br.readLine());
        System.out.println("Площадь прямоугольника составляет: " + (side1 * side2) + "см" + chSquare);

        System.out.println("Сейчас посчитаем площадь треугольника через 2 стороны и угол между ними.\nДля этого выполните следующие действия");
        System.out.println("Введите длину одной стороны (см): ");
        float line3 = Float.parseFloat(br.readLine());
        System.out.println("Введите длину второй стороны (см): ");
        float line4 = Float.parseFloat(br.readLine());
        System.out.println("Введите величину угла в градусах: ");
        double angle = Float.parseFloat(br.readLine()) * Math.PI / 180;// сразу переведем градусы в радианы
        System.out.println("Площадь треугольника составляет: " + (line3 * line4 * Math.sin(angle) / 2) + "см" + chSquare);
        */
        System.out.println("Введите строку не меньше чем из 5 символов : ");

            char ch = (char) br.read(); //читаем символ из буфера
            System.out.println("Unicode value of character " + ch + " is " + String.format("\\u%04x", (int) ch));
            System.out.println("Decimal value of character " + ch + " is " + (int) ch);
        ch = (char) br.read(); //читаем символ из буфера
        System.out.println("Unicode value of character " + ch + " is " + String.format("\\u%04x", (int) ch));
        System.out.println("Decimal value of character " + ch + " is " + (int) ch);
        ch = (char) br.read(); //читаем символ из буфера
        System.out.println("Unicode value of character " + ch + " is " + String.format("\\u%04x", (int) ch));
        System.out.println("Decimal value of character " + ch + " is " + (int) ch);
        ch = (char) br.read(); //читаем символ из буфера
        System.out.println("Unicode value of character " + ch + " is " + String.format("\\u%04x", (int) ch));
        System.out.println("Decimal value of character " + ch + " is " + (int) ch);
        ch = (char) br.read(); //читаем символ из буфера
        System.out.println("Unicode value of character " + ch + " is " + String.format("\\u%04x", (int) ch));
        System.out.println("Decimal value of character " + ch + " is " + (int) ch);

    }
}
