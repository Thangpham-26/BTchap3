import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("Input number");
        int n = k.nextInt();
        if (n == 0) System.out.print("Zero");
        else if (n > 0) System.out.print("Number is positive");
        else System.out.print("Number is negative");
 }
}
