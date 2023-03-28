import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        // Проверка на чет \нечет
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Введите число:");
        String strNum = br.readLine();
        int num = Integer.parseInt(strNum);
        boolean isEven = false;
        boolean is5multiplicity = false;
        String strOut = "нечетное";
        if (num%2==0){
            isEven=true;
            strOut = "четное";
        }
        System.out.println("Введенное число "+num+" есть "+strOut);
        // Проверка на делимость на 5
        if (num%5==0){
            is5multiplicity = true;
            System.out.println("Введенное число "+num+" кратное 5 ");
        }
        // Определение на мин\макс
        System.out.println("Введите число1:");
        int num1= Integer.parseInt(br.readLine());
        System.out.println("Введите число2:");
        int num2= Integer.parseInt(br.readLine());
        int min = 0;
        int max = 0;
        if (num1>num2){
            min = num2;
            max = num1;
            System.out.println("Из двух введенных чисел "+num1 +" и "+ num2 +"\nминимальным является "+min +",а максимальным является "+max);
        } else if (num1<num2) {
            min = num1;
            max = num2;
            System.out.println("Из двух введенных чисел "+num1 +" и "+ num2 +"\nминимальным является "+min +",а максимальным является "+max);
        }
        else {
            System.out.println("Из двух введенных чисел "+num1 +" и "+ num2 +"\nчисло "+num1 +" равняется "+num2);
        }
        // Неравенство треугольника
        System.out.println("Введите первую сторону треугольника:");
        int side1= Integer.parseInt(br.readLine());
        System.out.println("Введите вторую сторону треугольника:");
        int side2= Integer.parseInt(br.readLine());
        System.out.println("Введите третью сторону треугольника:");
        int side3= Integer.parseInt(br.readLine());
        boolean isTriangle = false;
        String textOutTriangle = "не есть";
        if (side1<=0 || side2 <=0 || side3 <=0){
            System.out.println("Указанный набор сторон "+textOutTriangle+" треугольником, т.к. длина стороны не может быть отрицательным числом или равным 0.");
        }
        else if ((side1+side2)>side3 & (side2+side3)>side1 & (side1+side3)>side2 ){
            isTriangle = true;
            textOutTriangle = "есть";
            System.out.println("Указанный набор сторон "+textOutTriangle+" треугольником");
        }
        else {
            System.out.println("Указанный набор сторон "+textOutTriangle+" треугольником");
        }

        // Вычисление квадратного корня
        System.out.println("Введите число для извлечения из него квадратного корня:");
        int toSqrt= Integer.parseInt(br.readLine());

        if (toSqrt >=0){
            System.out.println("Квадратный корень из "+toSqrt+" равняется "+Math.sqrt(toSqrt));
        }
        else {
            System.out.println("Квадратный корень нельзя брать из отрицательного числа!");
        }
        // Вычисление квадратного корня
        System.out.println("Введите первую угол треугольника:");
        int angle1= Integer.parseInt(br.readLine());
        System.out.println("Введите второй угол треугольника:");
        int angle2= Integer.parseInt(br.readLine());
        if(angle1<=0 || angle2<=0){
            System.out.println("Угол треугольника не может быть отрицательным значением или равным 0. Такого треугольника не существует");
        } else if ((180-angle2-angle1) > 0){
            System.out.println("Третий угол треугольника равен "+(180-angle2-angle1)+"\u00B0");
        }
        else {
            System.out.println("Сумма двух углов треугольника равна "+(angle2+angle1)+"\u00B0, что превышает допустимую сумму в 180\u00B0.");
        }
        Math.rou
    }
}