import java.io.BufferedReader;
import java.io.InputStreamReader;

import javax.swing.JSpinner.NumberEditor;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // Даны оценки двух учеников за четверть: Ученик1: 5, 3, 3, 4, 5, 4, 5, 5
        // Ученик2: 3, 4, 5, 5, 2, 5, 4
        // Найдите средний балл для каждого ученика и выясните, кто из них лучше учится.
        int student1[] = { 5, 3, 3, 4, 5, 4, 5, 5 };
        int student2[] = { 3, 4, 5, 5, 2, 5, 4 };
        int array1Lengt = student1.length;
        int array2Lengt = student2.length;
        double student1Average = 0.0D;
        double student2Average = 0.0D;
        int i = 0;
        while (i < array1Lengt) {
            student1Average = student1Average + student1[i];
            i++;
        }
        student1Average = student1Average / array1Lengt;
        System.out.println(student1Average);
        i = 0;
        while (i < array2Lengt) {
            student2Average = student2Average + student2[i];
            i++;
        }
        student2Average = student2Average / array2Lengt;
        System.out.println(student2Average);


        //Задача 4. Дано натуральное число n. Написать программу, которая вычисляет сумму S = 2 + 4 + … + 2*n.
        /* 
        String num1Str = br.readLine();
        int num1 = Integer.parseInt(num1Str);
        int sum = 0;
        i = 0;
        while (i <=num1){
            sum +=i*2;
            i++;
        }
        System.out.println(sum);
        */
        /*Задача 5.Вклад в банке составляет Х рублей. Ежегодно он увеличивается на P процентов, после чего дробная 
        часть копеек отбрасывается. Определите, через сколько лет вклад составит не менее У рублей. 
        Программа получает на вход три натуральных числа: Х, Р, У и должна вывести одно целое число.*/

        /*Что на входе: 
        1.Спросить у пользователя сумму вклада (тип целое), имя переменной сум наверное
        2. Спросить у пользователя количество ежегодных процентов, тип дабл, имя переменной процент.
        3. Спросить у пользователя сумму вклада финишную, тип целое, имя переменной сумАут
        4. ключевой алгоритм:
            к сумме прибавляем сумму процентов, отбрасываем дробную часть. Повторяем.
            условие выхода из цикла сум >= сумАут
        5. Профит.
        */
        System.out.println("Input sum start:");
        String sumStr = br.readLine();
        double sum = Double.parseDouble(sumStr);
        System.out.println("Input sum finish:");
        String sumOutStr = br.readLine();
        double sumOut = Double.parseDouble(sumOutStr);
        System.out.println("Input percent:");
        String percentStr = br.readLine();
        double percent = Double.parseDouble(percentStr);
        int numYear=1;
        while (sum<sumOut){
            sum = ((int)(sum+sum/100*percent))/1;
            numYear++;
            System.out.println(sum);
        }
        System.out.println(numYear);
    }
}