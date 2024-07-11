package ss4.bai_tap;

import java.util.Scanner;

public class MainPhuongTrinh {
    public static void main(String[] args) {
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập giá trị a");
        a = sc.nextDouble();
        System.out.println("Nhập giá trị b");
        b = sc.nextDouble();
        System.out.println("Nhập giá trị c");
        c = sc.nextDouble();
        PhuongTrinh pt = new PhuongTrinh(a,b,c);
        System.out.printf("giải phuong trinh "+pt.nghiem());

    }
}
