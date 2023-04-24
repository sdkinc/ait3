import java.net.*;

public class Main {
    public static void main(String[] args) throws Exception{
        Integer b=1000,a=1000;
        Integer c=100,d=100;
        System.out.println((a.byteValue()==b.byteValue())+","+(c.byteValue()==d.byteValue()));
    }
}