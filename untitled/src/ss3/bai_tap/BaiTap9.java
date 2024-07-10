package ss3.bai_tap;

import java.util.Scanner;

public class BaiTap9 {
    public static void main(String[] args) {
    double [][] arr = new double[4][4];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < 4; i++) {
        for (int j = 0; j < 4; j++) {
            System.out.print("Nhap vao phan tu hang "+ i + " cot "+ j +": ");
            double value = sc.nextInt();
            arr[i][j] = value;
        }
        System.out.println();
    }
    for (int i = 0; i < 4; i++) {
        System.out.printf("%-35s","Hang thu " + i+" cua mang: ");
        for (int j = 0; j < 4; j++) {
            System.out.print(arr[i][j] + "\t" + "\t");
        }
        System.out.println();
    }
    double tong = 0f;
    for (int i = 0; i < 4; i++) {
        tong += arr[i][i];
    }
    System.out.println("Tong duong cheo chinh: " + tong);


}
}
