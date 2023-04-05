public class Test3 {
    public static void main(String args[])
    {
        String string1 = new String("GeeksForGeeks");
        String string2 = new String("Practice");
        String string3 = new String("Geeks");
        String string4 = new String("Geeks");
        String string5 = new String("geeks");

        // Comparing for String 1 != String 2
        System.out.println("Comparing " + string1 + " and " + string2
                + " : " + string1.equalsIgnoreCase(string2));

        // Comparing for String 3 = String 4
        System.out.println("Comparing " + string3 + " and " + string4
                + " : " + string3.equalsIgnoreCase(string4));

        // Comparing for String 4 = String 5
        System.out.println("Comparing " + string4 + " and " + string5
                + " : " + string4.equalsIgnoreCase(string5));
        System.out.println("Перед вызовом ретерна");
        return;

    }

    static void myMethod(String fname) {
        if (fname.length() > 0) {
            System.out.println("Перед вызовом ретерна" + fname);
            return;
        }
        System.out.println("После вызова  ретерна");
    }
}