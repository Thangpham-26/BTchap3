public class ex8_tl {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 100; i++) {
            sum += i;
        }

        double average = (double) sum / 100;

        System.out.println("Gia tri trung binh cua cac so tu 1 den 100 la: " + average);
    }
}
