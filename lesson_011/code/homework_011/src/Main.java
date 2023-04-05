import java.io.BufferedReader;
import java.io.InputStreamReader;
// Задача 1. Написать бот, который задаёт собеседнику три вопроса. Сделать его ответы разными — использовать if ... else и сравнение строк. Пример: Как вас зовут? Какого вы пола? Какой у вас вес?
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Добрый день. проведем небольшую викторину: ");
        System.out.println("введите название планеты, на которой мы с Вами находимся:");
        String strNum1 = br.readLine();
        strNum1 = strNum1.toLowerCase();
        if (strNum1.equals(new String("земля"))){
            System.out.println("Правильно, давайте дальше:");
        }
        else {
            System.out.println("К сожалению, Ваш ответ неверный. Попробуйте в следующий раз.");
            return;
        }
        System.out.println("Вопрос №2: самая длинная река нашей планеты? (7100 км)");
        strNum1 = br.readLine();
        strNum1 = strNum1.toLowerCase();
        if (strNum1.equals(new String("амазонка"))){
            System.out.println("Правильно, давайте дальше:");
        }
        else if (strNum1.equals(new String("нил"))){
            System.out.println("К сожалению, река Нил является всего лишь второй по длине на нашей планете (6670 км).");
            return;
        }
        else {
            System.out.println("К сожалению, Ваш ответ "+strNum1+" неверный. Попробуйте в следующий раз.");
            return;
        }
        System.out.println("Вопрос №3: назовите ответ на главный вопрос жизни, вселенной и всего такого");
        strNum1 = br.readLine();
        strNum1 = strNum1.toLowerCase();
        if (strNum1.equals(new String("42"))){
            System.out.println("Бинго, Вы сегодня великолепны!");
        }
        else if (strNum1.equals(new String("666"))){
            System.out.println("Хорошая попытка, но нет)");
            return;
        }
        else if (strNum1.equals(new String("3.14159")) || strNum1.equals(new String("3,14159"))
                || strNum1.equals(new String("3.1415")) || strNum1.equals(new String("3,1415"))
                || strNum1.equals(new String("3.141")) || strNum1.equals(new String("3,141"))
                || strNum1.equals(new String("3.14")) || strNum1.equals(new String("3,14"))
        ){
            System.out.println("О-о-о, чувствуется физмат, но увы, ответ не верный");
            return;
        }
        else {
            System.out.println("К сожалению, Ваш ответ неверный. Попробуйте в следующий раз.");
            return;
        }
    }
}