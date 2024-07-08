package ss2.bai_tap;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1.Hinh chữ nhật");
        System.out.println("2.Hình tam giác vuông");
        System.out.println("3.Hình tam giác cân");
        System.out.println("4 exit");
        System.out.print("LỰA Chọn Của Bạn: ");
        int go = sc.nextInt();
        switch (go) {
            case 1:
                for (int i = 0; i < 4; i++) {
                    for (int j = 0; j <= 10; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:

                System.out.println();
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j <= i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 1; i <= 5; i++) {
                    for (int j = 1; j <= 5-i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 0:
                System.exit(0);
            default:
                System.out.println("Lựa Chọn Không Phù Hơợp");
        }

    }
}
