public class ex17_tl {
    public static void main(String[] args) {

        int number = 1;

        for (int i = 0; i < 6; i++) {
            System.out.print(number);

            if (i < 5) {
                System.out.print(", ");
            }
            else System.out.println(",...");

            number = number * 2 + 1;
        }
    }
}
