package ss3.bai_tap;

import java.util.Scanner;

public class BaiTap1 {
    public static void main(String[] args) {
        String chuoi = "hoangngoochieu";
        int dem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("NHẬP KIS TỰ BẠN CẦN TÌM");
        String kitu = sc.nextLine();
        System.out.println(chuoi.length());
        for (int i = 0; i < chuoi.length(); i++) {
            if (String.valueOf(chuoi.charAt(i)).equals(kitu)) {
                dem++;
            }
        }
        System.out.println(dem);

    }
}
