package ss3.thuc_hanh;

import java.util.Scanner;

public class ThucHanh4 {
    public static int countChar(String str, char ch) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;

            }

        } return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP CHUỖI");
        String str = sc.nextLine();
        System.out.println("nhập vào kí tự");
        char ch = sc.nextLine().charAt(0);
        System.out.println(ch);

        System.out.println("số lần xuất hiện"+ countChar(str, ch));
    }
}
