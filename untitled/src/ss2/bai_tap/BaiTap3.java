package ss2.bai_tap;

import java.util.Scanner;

public class BaiTap3 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Menu");
            System.out.println("1. Hình chữ nhật");
            System.out.println("2. Hình tam giác vuông");
            System.out.println("3. Hình tam giác cân");
            System.out.println("0. Exit");
            System.out.print("Lựa chọn của bạn: ");
            int go = sc.nextInt();

            switch (go) {
                case 1:
                    for (int i = 0; i < 4; i++) {
                        for (int j = 0; j < 10; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j <= i; j++) {
                            System.out.print("*");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    for (int i = 1; i <= 5; i++) {
                        for (int j = 1; j <= 5 - i; j++) {
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
                    System.out.println("Lựa chọn không phù hợp");
            }

            sc.close();
        }
    }