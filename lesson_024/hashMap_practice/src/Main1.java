import java.util.HashMap;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("HashMap\tGroup sex");
        HashMap<String, String> group26MapSex = new HashMap<>();
        group26MapSex.put("Oleksandr Zhurba", "m");
        group26MapSex.put("Galina", "f");
        group26MapSex.put("Aleksandra", "f");
        group26MapSex.put("Marina", "f");
        group26MapSex.put("Luka", "m");
        group26MapSex.put("Yulia", "f");
        group26MapSex.put("Tetiana", "f");
        group26MapSex.put("Firuz", "m");
        group26MapSex.put("Andrei ", "m");
        group26MapSex.put("Egor", "m");
        group26MapSex.put("Dmitrijs", "m");
        group26MapSex.put("Wladimir", "m");
        group26MapSex.put("Galina", "f");
        //System.out.println(group26MapSex);
        int mSex = 0;
        int fSex = 0;
        for (String sex : group26MapSex.keySet()) {
            if (group26MapSex.get(sex).equalsIgnoreCase("m")) {
                mSex++;
            } else {
                fSex++;
            }
        }
        System.out.println("mSex" + mSex);
        System.out.println("fSex" + fSex);
    }
}