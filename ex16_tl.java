public class ex16_tl {
    public static void main(String[] args) {

        for (int i = 1; i <= 7; i++) {
            int number = i * i - 1;
            System.out.print(number);

            if (i < 7) {
                System.out.print(", ");
            }
            else System.out.println(",...");
        }
    }
}
