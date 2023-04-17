import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("100 random duplicate");
        int[] myArr = new int[100];
        for (int i = 0; i < myArr.length; i++) {
            myArr[i] = (int) (Math.random() * (10 - 1 + 1) + 1);
        }
        System.out.println(Arrays.toString(myArr));
        HashSet<Integer> myHashSet = new HashSet<Integer>();
        for (int i = 0; i < myArr.length; i++) {
            myHashSet.add(myArr[i]);
        }
        System.out.println(myHashSet);
    }
}