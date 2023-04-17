import java.util.HashSet;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        /*
        Задача 1:Написать приложение, которое позволит понять, из каких мест
        на данную почту приходят письма.
         */
        Scanner sc = new Scanner(System.in);
        char userChoise;
        HashSet<Integer> postCodes = new HashSet<Integer>();
        do {
            System.out.println("PLs input postCode");
            if (postCodes.add(sc.nextInt())) {
                System.out.println("Post code added");
            } else {
                System.out.println("Post code already exist");
            }
            System.out.println(postCodes);
            System.out.println("for stop press S");
            userChoise = sc.next().toLowerCase().charAt(0);
            if (userChoise == 's') {
                break;
            }
        } while (true);
    }

}