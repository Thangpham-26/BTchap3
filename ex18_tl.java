public class ex18_tl {
    public static void main(String[] args) {

        int number = 1;

        for (int i = 0; i < 10; i++) {
            System.out.print(number);
            if (i < 9) {
                System.out.print(", ");
            }
            number = number * 2 + (i + 1);
        }
    }
}
