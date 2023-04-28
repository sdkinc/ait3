import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

public class TaskVotesCalc {
    public static void main(String[] args) throws FileNotFoundException {
        String fileName = "res/in.txt";
        HashMap<String, Integer> result = readFromFile(fileName);
        System.out.println(result);

    }

    private static HashMap<String, Integer> readFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        int lines = scanner.nextInt();
        scanner.nextLine();

        HashMap<String, Integer> result = new HashMap<>();
        while(lines > 0){
            String name = scanner.next();
            int votes = scanner.nextInt();
            if (result.containsKey(name)){
                votes = votes+result.get(name);
            }
            result.put(name,votes);
            lines--;
        }
        return result;
    }
}