package ss3.thuc_hanh;

import java.util.Scanner;

public class ThucHanh {
    public static void main(String[] args) {
        String chuoi = "1,3,4,5,12,41,2,2,4,41,";
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP số bạn cần tìm");
        String kitu = sc.nextLine();
        System.out.println(chuoi.length());
        for (int i = 0; i <= chuoi.length() - kitu.length(); i++) {
            if (chuoi.substring(i, i + kitu.length()).equals(kitu)) {
                dem++;
            }
        }
        System.out.println( "số lần lặp lại là " +dem);

        sc.close();
    }
}
