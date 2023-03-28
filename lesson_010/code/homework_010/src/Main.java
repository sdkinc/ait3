import java.io.BufferedReader;
import java.io.InputStreamReader;
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Введите первое число:");
        String strNum1 = br.readLine();
        int num1 = Integer.parseInt(strNum1);
        System.out.println("Введите второе число:");
        String strNum2 = br.readLine();
        int num2 = Integer.parseInt(strNum2);
        System.out.println("Введите третье число:");
        String strNum3 = br.readLine();
        int num3 = Integer.parseInt(strNum3);
        int maxNum = -9999999;
        boolean maxNumIsFinded = false;
        if (num1 > num2 & num2 > num3){
            maxNum = num1;
            maxNumIsFinded = true;
        }
        else if (num2 > num1 & num2 > num3){
            maxNum = num2;
            maxNumIsFinded = true;
        }
        else if (num3 > num1 & num3 > num2){
            maxNum = num3;
            maxNumIsFinded = true;
        }
        else {
            maxNumIsFinded = false;
        }

        if (maxNumIsFinded==true) {
            System.out.println("Максимальное число в указанном наборе чисел ="+maxNum);
        }
        else {
            System.out.println("Не удалось определить максимальное число в указанном наборе");
        }

    }
}