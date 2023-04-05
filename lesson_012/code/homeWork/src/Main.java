import java.io.BufferedReader;
import java.io.InputStreamReader;
//Задача 1.
//Написать программу, которая принимает с клавиатуры номер месяца и год и выводит на экран название месяца и количество дней в нем.

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите год числом:");
        String numStr = br.readLine();
        int year = Integer.parseInt(numStr);
        System.out.println("Введите месяц числом:");
        numStr = br.readLine();
        int month = Integer.parseInt(numStr);

        switch (month){
            case 1:
                System.out.println("Januar hat 31 Tagen");
                break;
            case 2:
                System.out.println("Februar hat "+(( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) )?29:28)+" Tagen");
                break;
            case 3:
                System.out.println("März hat 31 Tagen");
                break;
            case 4:
                System.out.println("April hat 30 Tagen");
                break;
            case 5:
                System.out.println("Mai hat 31 Tagen");
                break;
            case 6:
                System.out.println("Juni hat 30 Tagen");
                break;
            case 7:
                System.out.println("Juli hat 31 Tagen");
                break;
            case 8:
                System.out.println("August hat 31 Tagen");
                break;
            case 9:
                System.out.println("September hat 30 Tagen");
                break;
            case 10:
                System.out.println("Oktober hat 31 Tagen");
                break;
            case 11:
                System.out.println("November hat 30 Tagen");
                break;
            case 12:
                System.out.println("December hat 31 Tagen");
                break;
            default:
                System.out.println("Vielleicht Sie haben einen Fehler gemacht. Prüfen Sie bitte Monatnummer.");
                break;
        }
    }
}