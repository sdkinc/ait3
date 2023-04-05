// Java program to show how to compare Strings
// using library function
public class Test2
{ public static void main(String[] args)
{
    String s1 = "ABC";
    String s2 = "ABC";
    String s3 = "Shyam";
    String s4 = "Ram";

    System.out.println(" Comparing strings with compareTo:");
    System.out.println(s1.compareTo(s2));
    System.out.println(s1.compareTo(s3));
    System.out.println(s1.compareTo(s4));
}
}