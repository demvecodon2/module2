package ss3.bai_tap;

import java.util.Scanner;

public class BaiTap6 {
    public static void main(String[] args) {
        int [][]arr = new int [3][];
        arr[0] = new int [2];
        arr[1] = new int [2];
        arr[2] = new int [2];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                int value = sc.nextInt();
                arr[i][j] = value;

            }
            System.out.println();

        }
        int min = arr[0][0];
        int hang=0;
        int cot=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int value = arr[i][j];
                if (value < min) {
                    min = arr[i][j];
                    hang = i;
                    cot = j;
                }
            }
        }
        System.out.println("số nhỏ nhất ở hàng "+hang+ "và cột" +cot);
    }
    }
