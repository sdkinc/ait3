// Java program to understand
// why to avoid == operator

public class Test {
    public static void main(String[] args)
    {
        String s1 = new String("HELLO");
        String s2 = new String("HELLO");

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
    }
}