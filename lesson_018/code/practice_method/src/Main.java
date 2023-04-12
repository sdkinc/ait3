public class Main {
    public static void main(String[] args) {
        int numb1 = 5;
        int powN = 10;
        System.out.println(pow(numb1, powN));
        System.out.println(faktorial(5));
        printStringNTimes("" + faktorial(5), 5);

    }
    //_________________________________________ место для методов
    //MEthod ! faktorial

    public static int faktorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

    // Method to calc number in pow3

    public static int pow(int numb, int powNumber) {
        int res = numb;
        for (int i = 1; i < powNumber; i++) {
            res *= numb;
        }
        return res;
    }


    public static void printStringNTimes(String s, int n) {
        for (int i = 0; i < n; i++) {
            System.out.println(s);
        }
    }

    //_________________________________________ Конец места для методов
}