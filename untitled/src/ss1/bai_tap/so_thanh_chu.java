package ss1.bai_tap;

import java.util.Scanner;

public class so_thanh_chu {
    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so can check");
        number = scanner.nextInt();
        if (number < 0 || number > 999){
            System.out.println("Số vừa nhập chưa đúng");
        }
        else {
            System.out.println(InRaChu(number));
        }
    }
    public static String InRaChu(int number) {
        String chu = "";
        String[] A = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
        String[] B = {"", "Mười ", "Hai mươi ", "Ba mươi ", "Bốn mươi ", "Năm mươi ", "Sáu mươi ", "Bảy mươi ", "Tám mươi ", "Chín mươi "};
        if (number == 0) {
            chu += "Không";
        } else if (number < 10) {
            chu += A[number];
        } else if (number < 100) {
            chu += B[number / 10];
            chu += A[number % 10];
        } else {
            chu += A[number / 100] + " Trăm ";
            number %= 100;
            chu += B[number / 10];
            chu += A[number % 10];

        }
        return chu;
    }
    }
