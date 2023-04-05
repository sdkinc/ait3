import java.io.BufferedReader;
import java.io.InputStreamReader;
//Задача 2 (*). Решение квадратного уравнения по коэффициентам квадратного трехчлена а, b и с
public class Test {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите коэффициент А:");
        String strNum1 = br.readLine();
        double num1 = Double.parseDouble(strNum1);
        System.out.println("Введите коэффициент В:");
        String strNum2 = br.readLine();
        double num2 = Double.parseDouble(strNum2);
        System.out.println("Введите коэффициент С:");
        String strNum3 = br.readLine();
        double num3 = Double.parseDouble(strNum3);
        System.out.println("Вычисляем дискриминант по формуле В**2-4*А*С");
        double discriminant = Math.pow(num2,2)-4*num1*num3;
        if (discriminant < 0){
            System.out.println("У данного уравнения нет корней");
        } else if (discriminant==0) {
            System.out.println("У данного уравнения eсть один корень: Х=" +(-num2/2*num1));
        }
        else {
            System.out.println("У данного уравнения eсть два корня: Х1=" +((-num2+Math.sqrt(discriminant))/2*num1)+" и Х2="+((-num2-Math.sqrt(discriminant))/2*num1));
        }
    }
}