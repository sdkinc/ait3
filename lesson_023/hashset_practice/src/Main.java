import java.util.Collections;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        /*
        HashSet<String> myHashSet = new HashSet<String>();
        myHashSet.add("Zфарпыапврывапиртыапиы");
        for (int i = 65; i < 91; i++) {
            myHashSet.add(String.valueOf((char) (i)));
            System.out.print(i + " ");
            System.out.println(myHashSet.hashCode());
        }
        System.out.println(myHashSet);
        myHashSet.add("Zф");
        System.out.println(myHashSet);
         */
        String element = "";
        element = "A";
        System.out.println(element.hashCode());
        element = "AA";
        System.out.println(element.hashCode());
    }
}