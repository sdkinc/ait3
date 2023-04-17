import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("Alphabet");
        ArrayList<String> myArrList = new ArrayList<String>();
        for (int i = 0; i <= 300; i++) {
            myArrList.add(String.valueOf((char) i));
        }
        System.out.println(myArrList);
    }
}