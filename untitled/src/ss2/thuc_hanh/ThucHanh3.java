package ss2.thuc_hanh;


import java.util.Scanner;

public class ThucHanh3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP VÀO");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("NHẬP" + (i + 1));
            arr[i] = sc.nextInt();
        }
        for (int temp : arr) {
//        System.out.println(Arrays.toString(arr));
            System.out.println(temp);
        }
    }
}