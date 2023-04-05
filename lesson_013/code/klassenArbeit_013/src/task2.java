import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double s = sc.nextInt();
        int target = sc.nextInt();
        int day = 1;
        while (target-s>0){
            s=s+(s*0.1);
            day += 1;
        }
        System.out.println(day);
    }
}
