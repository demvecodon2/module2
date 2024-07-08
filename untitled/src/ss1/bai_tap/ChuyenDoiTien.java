package ss1.bai_tap;

import java.util.Scanner;

public class ChuyenDoiTien {
    public static void main(String[] args) {
        double rate = 23000;
        System.out.println("nhập vào số tiền muốn chuyển đổi");
        Scanner sc = new Scanner(System.in);
        double usd = sc.nextDouble();
        double vnd = usd * rate;
        System.out.println("vnd = " + vnd);
    }
}
