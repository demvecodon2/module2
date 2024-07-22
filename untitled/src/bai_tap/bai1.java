package bai_tap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("NHẬP VÀO");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
            sum  +=  i;
        }
    }
        System.out.println(sum);
        scanner.close();
}
}