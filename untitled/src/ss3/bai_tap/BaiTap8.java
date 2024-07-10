package ss3.bai_tap;

import java.util.Scanner;

public class BaiTap8 { public static void main(String[] args) {
    double[][]arr = new double[3][5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print("Nhap vao phan tu hang "+ i + " cot "+ j +": ");
            int value = sc.nextInt();
            arr[i][j] = value;
        }
        System.out.println();
    }
    System.out.println("Tinh tong cua cot thu: ");
    int cot = sc.nextInt();
    System.out.println("Tong cua cot thu: " + cot+ "la: "+ Tong(arr, cot));
}
    public static double Tong(double[][] arr, int cot) {
        double tong = 0;
        for (int i = 0; i < arr.length; i++) {
            tong += arr[i][cot];
        }
        return tong;
    }
}
