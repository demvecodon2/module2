package ss3.thuc_hanh;

import java.util.Scanner;

public class ThucHanh3 {
    public static int sumOdd(int n) {
        int sumOdd = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 != 0) {
                sumOdd += i;
            }
        }
        return sumOdd;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      System.out.print("Nhập số vào: ");
       int a = scanner.nextInt();
       System.out.println("Tổng các số lẻ đến " + a + " là: " + sumOdd(a));

            }
        }



