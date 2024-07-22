package bai_tap;

import java.util.Scanner;

public class bai2 {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;

    }
    public static int icm( int a, int b ,int gcd) {
       return (a*b)/gcd;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP VÀO SỐ ĐẦU TIÊN");
        int n = sc.nextInt();
        System.out.println("NHẬP VÀO SỐ THỨ 2");
        int m = sc.nextInt();
        int gcd = gcd(n, m);
        int icm = icm(n, m, gcd);
        double average = (n+m)/2;
        System.out.println("ƯỚC CHUNG LỚN NHẤT "+n+" "+m+" "+gcd);
        System.out.println("bội CHUNG nhỏ NHẤT "+n+" "+m+" "+icm);
        System.out.println("trung bình cộng "+average);
    }
}
