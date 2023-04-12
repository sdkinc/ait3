public class Main5 {
    public static void main(String[] args) {
        //Задача 3 ().* Имеется массив, содержащий данные о возрастах студентов в группе.
        // Создайте метод, который определит самого старшего студента и выведет на печать
        // его номер в списке и возраст.
        //int[] arr = {18, 19, 18, 19, 18, 20, 18, 21, 33, 18, 19, 20};
        //getIndexOfMaxValue(arr);

        rectangleDrawing(7, 7);
    }

    public static void getIndexOfMaxValue(int[] arr) {
        //int maxIndex=-1;
        int maxIndex = 0;
        int maxValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxValue < arr[i]) {
                maxValue = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("Student on pos " + maxIndex + " with value " + arr[maxIndex]);
    }


    public static void rectangleDrawing(int b, int a) {
        for (int i = 1; i <= a; i++) {
            for (int j = 1; j <= b; j++) {
                if (i != 1 & j != 1 & i != a & j != b) {
                    System.out.print("   ");
                    continue;
                }
                System.out.print(" * ");
            }
            System.out.print("\n");
        }
    }
}