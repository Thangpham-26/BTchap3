public class ex21_tl {
    public static void main(String[] args) {
        // In ra từng số từ 0 đến FFFF theo hệ thập lục phân
        for (int i = 0; i <= 0xFFFF; i++) {
            // Sử dụng hàm Integer.toHexString để chuyển số sang hệ thập lục phân
            String hex = Integer.toHexString(i).toUpperCase();

            // In ra số dưới dạng thập lục phân, với định dạng 4 ký tự (thêm số 0 nếu cần)
            System.out.printf("%04X\n", i);
        }
    }
}
