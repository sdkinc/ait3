import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        System.out.println("Arraylist practice");
        ArrayList<String> myArrList = new ArrayList<String>();
        myArrList.add("BMW");
        myArrList.add("Lexus");
        myArrList.add("Nissan");
        myArrList.add("Dodge");
        System.out.println(myArrList);
        myArrList.add(2, "Porsche");
        System.out.println(myArrList.get(3));
        System.out.println(myArrList.toString());
        System.out.println(myArrList.size());
        System.out.println(myArrList.indexOf("Lexus"));
        myArrList.remove(0);
        System.out.println(myArrList.indexOf("Lexus"));
        System.out.println(myArrList.contains("Lexus"));
        if (myArrList.contains("Kia") == false) {
            myArrList.add("Kia");
        }
        System.out.println(myArrList);
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println(myArrList.get(i));
        }
        myArrList.sort(Collections.reverseOrder());
        
        System.out.println(myArrList);
    }
}