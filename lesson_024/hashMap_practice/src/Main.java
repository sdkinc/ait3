import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println("HashMap\tGroup");
        HashMap<String, Integer> group26Map = new HashMap<>();
        group26Map.put("Oleksandr Zhurba", 38);
        group26Map.put("Galina", 44);
        group26Map.put("Aleksandra", 16);
        group26Map.put("Marina", 41);
        group26Map.put("Luka", 28);
        group26Map.put("Yulia", 52);
        group26Map.put("Tetiana", 34);
        group26Map.put("Cristian Pasat", 30);
        group26Map.put("Firuz", 30);
        group26Map.put("Andrei ", 36);
        group26Map.put("Egor", 29);
        group26Map.put("Dmitrijs", 32);
        group26Map.put("Wladimir", 31);
        group26Map.put("Galina", 34);
        //System.out.println(group26Map);
        for (String name : group26Map.keySet()) {
            System.out.print("" + name + "\t");
            System.out.println(group26Map.get(name));
        }
        for (int age : group26Map.values()) {
            System.out.println("" + age + "\t");
        }
    }
}