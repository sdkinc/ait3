import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //Задача 1. Программа получает на вход строку и число повторений этой строки
        // Программа должна вывести эту строку нужное количество раз.

        System.out.println("Input string");
        String stringToLoop = br.readLine();
        System.out.println("Input loop count");
        String strNum1 = br.readLine();
        int num1 = Integer.parseInt(strNum1);

        while(num1 > 0){
            System.out.println(stringToLoop);
            num1--;
        }

        //Задача 2. В первый день спортсмен пробежал s километров, а затем он каждый день увеличивал пробег
        // на 10 % от предыдущего значения. Определите номер дня, на который пробег спортсмена составит не менее
        // target километров. Программа получает на вход действительные числа s и target и
        // должна вывести одно натуральное число.
        System.out.println("Input S (first day km)");
        String stringS = br.readLine();
        double numS = Double.parseDouble(stringS);
        System.out.println("Input target km");
        String strTarget = br.readLine();
        double target = Double.parseDouble(strTarget);
        int dayCount=1;
        double sum=numS;
        while (sum<=target){
            numS = numS * 1.1;
            sum+=numS;
            dayCount++;
        }
        System.out.println(dayCount);


        //Задача 3 ().* Всем известно, что ведьмак способен одолеть любых чудовищ, однако его услуги обойдутся недешево,
        // к тому же ведьмак не принимает купюры, он принимает только чеканные монеты. В мире ведьмака существуют монеты
        // с номиналами 1, 5, 10, 25. Напишите программу, которая определяет, какое минимальное количество чеканных
        // монет нужно заплатить ведьмаку. На вход программе подается одно натуральное число, цена за услугу ведьмака.
        // Программа должна вывести минимально возможное количество чеканных монет для оплаты его услуг.

        System.out.println("Enter the cost of the Witcher's services");
        String costStr = br.readLine();
        int cost = Integer.parseInt(costStr);
        int m1=0;
        int m5=0;
        int m10=0;
        int m25=0;
        while(cost > 0){
            if (cost > 25){
                m25++;
                cost -=25;
            } else if (cost > 10){
                m10++;
                cost -=10;
            } else if (cost > 5){
                m5++;
                cost -=5;
            } else if (cost > 1){
                m1=cost;
                cost =0;
            }
        }
        System.out.println("The following coins are required: 25*"+m25+", 10*"+m10+", 5*"+m5+", 1*"+m1);


        //Задача 4 ().* Заданы две клетки шахматной доски. Напишите программу, которая определяет имеют ли
        // указанные клетки один цвет или нет. Если они покрашены в один цвет, то выведите слово «YES»,
        // а если в разные цвета — то «NO».
        //Что на входе?
        //Координата вида А1 Н8
        //Что на выходе?
        //Строка YES или NO, в зависимости от выполнения условия.
        //ключевой алгоритм:
        //представим каждую букву в виде количества клеток предыдущих строк, т.е. для клетки А1 А соответствует 0,
        // для клетки В1 В соответствует 8. Дальше добавляем к этому количеству цифру количества клеток в текущей строке.
        //Получится натуральное число. При сравнении четности обоих координат, если четность совпадает, то совпадает и цвет.
        //Т.е. Кейс для буквы, и потом плюс для цифры. и в конце тернарный оператор.
        // Перед циклом переменные с общими данными тек буква, тек цифра. В цикле сначала поределяем по номеру прохода
        // какая координата обрабатывается, и присваеем переменным цикла соотв значения. После кейса в цикле, присваиваем
        // соответствующим ячейкам числовое предстваление координаты. Потом тернарный оператор в выводе.
        //
        Scanner sc = new Scanner(System.in);
        System.out.println("Please input the coordinates of first cell as 'A 1':");
        String letter1 = sc.next();
        letter1 = letter1.toUpperCase();
        int number1 = sc.nextInt();
        int cell1=0;
        System.out.println("Please input the coordinates of second cell as 'A 1':");
        String letter2 = sc.next();
        letter2 = letter2.toUpperCase();
        int number2 = sc.nextInt();
        int cell2=0;
        String letterCondition="";
        int currentCell = 0;
        int currentNumber = 0;
        int i=0;
        for (i=0;i<=1;i++){
            if (i==0){
                letterCondition = letter1;
                currentNumber = number1;
            }
            else {
                letterCondition = letter2;
                currentNumber = number2;
            }
            switch (letterCondition){
                case "A":
                    currentCell = currentNumber+0;
                case "B":
                    currentCell = currentNumber+8;
                case "C":
                    currentCell = currentNumber+16;
                case "D":
                    currentCell = currentNumber+24;
                case "E":
                    currentCell = currentNumber+32;
                case "F":
                    currentCell = currentNumber+40;
                case "G":
                    currentCell = currentNumber+48;
                case "H":
                    currentCell = currentNumber+56;
                default:
                    currentCell = 0;
            }
            if (i==0){
                cell1 = currentCell;
            }
            else {
                cell2 = currentCell;
            }
        }
        System.out.println( ((cell1%2==0&cell2%2==0)|(cell1%2!=0 & cell2%2!=0))?"YES":"NO" );
    }
}