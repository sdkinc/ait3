public class Main {
    public static void main(String[] args) {
        String day = "День";
        String and = "и";
        String night = "Ночь";
        String dayAndNight = day + " " + and + " " + night;
        System.out.println(dayAndNight);
        System.out.println(dayAndNight.charAt(dayAndNight.length()-1));
        String java = "I like Java!!!";
        System.out.println(java.contains("Java"));
        System.out.println(java.indexOf("Java"));
        System.out.println(java.replace('a','o'));
        System.out.println(java.toUpperCase());
        System.out.println(java.toLowerCase());
        System.out.println(java.substring(7,11));
        System.out.println(java.endsWith("!!!"));
        System.out.println(java.startsWith("I like"));
    }
}