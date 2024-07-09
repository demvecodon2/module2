package ss3.bai_tap;


import java.util.Scanner;

public class BaiTap2 {
    public static void main(String[] args) {
        int[] arr = {1, 23, 4, 41, 12, 43, 9};
        int index = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập phần tử bạn muốn xoá:");
        int n = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                index = i;
                break;
            }
        }

        if (index == -1) {
            System.out.println("Phần tử không tồn tại trong mảng.");
        } else {
            int[] newArray = new int[arr.length - 1];
            for (int i = 0, j = 0; i < arr.length; i++) {
                if (i == index) {
                    continue;
                }
                newArray[j++] = arr[i];
            }
            arr = newArray;
            System.out.println("Mảng mới là:");
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}
