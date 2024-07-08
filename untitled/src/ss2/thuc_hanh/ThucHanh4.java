package ss2.thuc_hanh;

import java.util.Arrays;
import java.util.Scanner;

public class ThucHanh4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP 1");
        int n = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("nhap 2");
        int n1 = sc1.nextInt();
        int[][] arr = new int[n][n1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("Nhap " + (i + 1) + "th " + (j + 1));
                arr[i][j] = sc1.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));

    }
}
