import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите произвольную строку: ");
        String str = br.readLine();
        System.out.println("Длинна строки равна: "+str.length()+", первый символ равен: "+str.substring(0,1)+", последний символ равен: "+str.substring(str.length()-1,str.length()));

        System.out.println("Введите произвольную строкус четным количеством символов: ");
        String str2 = br.readLine();
        int startPos = str2.length()/2;
        System.out.println("Средние символы слова "+str2+ " составляют "+str2.substring(startPos-1,startPos+1));

        System.out.println("Введите произвольную строку: ");
        String str3 = br.readLine();
        int linksIndex = 0;
        int rightIndex = str3.length()-1;
        System.out.println("Левый индекс строки "+str3+ " составляет "+linksIndex+",\nправый индекс строки "+str3+" составляет "+rightIndex);
        System.out.println("Подстрока с указанными индексами составляет "+str3.substring(linksIndex,1)+str3.substring(rightIndex));
        System.out.println("Подстрока с указанными индексами составляет "+str3.substring(linksIndex,100500));


        //System.out.println("Длинна строки равна: "+str.length()+", первый символ равен: "+str.substring(0,1)+", последний символ равен: "+str.substring(str.length()-1,str.length()));
    String f = «Ппп»;
    }
}