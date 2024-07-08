package ss2.bai_tap;

public class BaiTap2 {
    public static void main(String[] args) {
        int index = 1;
        System.out.println("1,2");
        int x = 3;
        while (x < 100) {
            boolean ketQua = true;
            for (int i = 2; i <= Math.sqrt(x); i++) {
                if (x % i == 0) {
                    ketQua = false;
                    break;
                }
            }
            if (ketQua) {
                index++;
                System.out.println(index + ":" + x);
            }
            x++;
        }
    }
}
