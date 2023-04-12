public class Main4 {
    public static void main(String[] args) {
        System.out.println("Break ");
        for (int i = 0; i < 10; i++) {
            if (i == 4) {
                continue;
            } else if (i == 7) {
                break;
            }
            System.out.println(i);
        }
    }
}
