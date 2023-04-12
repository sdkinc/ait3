import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        System.out.println("Methods - example with array");

        int[] numbers = {46, 13, 13, -100, 67, -4, 20, 56, -10, 35};
        System.out.println("Array: " + Arrays.toString(numbers));
        System.out.println();


    }
    // ___________ methods ________________
    //метод находит минимальный элемент в массиве

    public static int getIndexOfMinValue(int[] arr) {
        int minInd = 0;
        int minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minValue) {
                minInd = i;
                minValue = arr[i];
            }
        }
        return minInd;
    }

    // ___________ end of methods ________________
}