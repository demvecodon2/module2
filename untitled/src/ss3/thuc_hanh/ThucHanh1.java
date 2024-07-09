package ss3.thuc_hanh;

import java.util.Scanner;

public class ThucHanh1 {

    public static void main(String[] args) {
        int [][]arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[3];
        arr[2] = new int[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                int value = sc.nextInt();
                arr[i][j] = value;
            }
            System.out.println();

        }int min=arr[0][0];
        int hang =0;
        int cot=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < min) {
                    min = arr[i][j];
                    hang = i;
                    cot = j;

                }
            }
        }
        System.out.println("Gia tri nho nhat la: "+ min+" nam o hang " +hang+ " cot " + cot);
    }
}
