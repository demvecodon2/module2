package ss3.bai_tap;

import java.util.Scanner;

public class BaiTap3 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 122, 113, 123, 132, 12};
        int index;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the index");
        index = sc.nextInt();
        System.out.println("Enter the value");
        x = sc.nextInt();
        int[] newArray = new int[array.length + 1];
        for (int i = 0, j = 0; i < array.length; j++, i++) {
            if (j == index) {
                newArray[j] = x;
                i--;
            } else {
                newArray[j] = array[i];
            }
        }
        System.out.println("The new array is");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + "");
        }
        System.out.println();
        System.out.println("Enter the index");
        for (int i = 0; i < newArray.length; i++) {
            System.out.println(newArray[i]);

        }
    }
}
