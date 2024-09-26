public class ex20_tl {
    public static void main(String[] args) {
        int number = 6;
        int factorial = 1;

        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        System.out.println("The factorial of 6 is: " + factorial);
    }
}
