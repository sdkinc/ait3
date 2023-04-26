import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task1_nw029 {

    private static final int RADIX = 2;

    public static void main(String[] args) throws IOException {
        //Задача 1
        //Напишите программу, которая:
        //    прочитает целое число из файла res/in.txt
        //    переведёт его в двоичную запись
        //    запишет его в файл res/out.txt
        //Воспользуйтесь методом decToBin(int number) из задачи 1 предыдущего урока
        // или информацией из разбора домашнего задания.
        FileReader fileReader = new FileReader("res/in.txt");
        BufferedReader br = new BufferedReader(fileReader);

        try {
            int number = Integer.parseInt(br.readLine());
            FileWriter outputFileWriter = new FileWriter("res/out.txt");
            String bin = decToBin(number);
            outputFileWriter.write(bin + "\n");
            outputFileWriter.close();
        } catch (NumberFormatException e) {
            System.out.println("Неправильный формат целого числа: " + e.getMessage());
        }
    }

    public static String decToBin(int number) {
        if (number == 0) {
            return (number + "\n");
        }

        StringBuilder bin = new StringBuilder();
        boolean isNegative = (number < 0);
        number = Math.abs(number); // для целей деления и перебора чисел убрали знак
        while (number != 0) { // пока в числе есть цифры
            int digit = number % RADIX; // последняя цифра - остаток от деления на основание (2)
            bin.insert(0, digit);
            // убираем последнюю цифру, находим целую часть от деления на основание
            number /= RADIX; // number = number / RADIX; // +=, -=, *=, /=
        }

        return isNegative ? "-" + bin : bin.toString();
    }
}
