import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2Sum {

  public static void main(String[] args) throws IOException {
    File inputFile = new File("res/input.txt");
    FileReader fileReader = new FileReader(inputFile);
    BufferedReader br = new BufferedReader(fileReader);
    int a = Integer.parseInt(br.readLine());
    int b = Integer.parseInt(br.readLine());
    System.out.println("a" + a + "b" + b);
    FileWriter outputFileWriter = new FileWriter("res/output.txt");
    outputFileWriter.write(Integer.toString(a + b));
    outputFileWriter.close();
  }

}
