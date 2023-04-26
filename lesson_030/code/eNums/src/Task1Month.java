import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Task1Month {
    public static void main(String[] args) throws IOException {
        Map<String, Integer> daysPerMonth = new HashMap<>();
        daysPerMonth.put("january",31);
        daysPerMonth.put("february",28);
        daysPerMonth.put("march",31);
        daysPerMonth.put("april",30);
        daysPerMonth.put("may",31);
        daysPerMonth.put("june",30);
        daysPerMonth.put("july",31);
        daysPerMonth.put("august",31);
        daysPerMonth.put("september",30);
        daysPerMonth.put("october",31);
        daysPerMonth.put("november",30);
        daysPerMonth.put("december",31);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Please input the month:");
        String month = br.readLine();
        if (daysPerMonth.containsKey(month.toLowerCase())){
            System.out.println(month+" has "+daysPerMonth.get(month.toLowerCase())+" days");
        }
        else{
            System.out.println("We know nothing about "+month);
        }
    }

    private enum Month{

    }
}