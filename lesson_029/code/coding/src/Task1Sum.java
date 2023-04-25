import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Task1Sum {

  public static void main(String[] args) throws Exception {
    File inputFile = new File("res/input.txt");
    System.out.println(inputFile.getAbsolutePath());
    FileReader fileReader = new FileReader(inputFile);
    BufferedReader br = new BufferedReader(fileReader);
    System.out.println(br.readLine());
    System.out.println(br.readLine());
    System.out.println(inputFile.length());
  }

}
