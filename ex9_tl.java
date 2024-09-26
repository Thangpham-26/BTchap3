public class ex9_tl {
    public static void main(String[] args) {
        int largestNumber = -1;


        for (int i = 100; i >= 1; i--) {
            if (i % 7 == 0) {
                largestNumber = i;
                break;
            }
        }

        if (largestNumber != -1) {
            System.out.println("Số lớn nhất giữa 1 và 100 chia hết cho 7 là: " + largestNumber);
        } else {
            System.out.println("Không có số nào giữa 1 và 100 chia hết cho 7.");
        }
    }
}
