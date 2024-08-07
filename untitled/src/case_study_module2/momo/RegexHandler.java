package case_study_module2.momo;

import java.util.Scanner;

public class RegexHandler {
    private static final String REGEX_ID = "^ID-[0-9]{4}$";
    private static final String REGEX_NAME = "^[a-zA-Z ]{4,30}$";
    private static final String REGEX_GIA = "^[0-9]+$";
    private static final String REGEX_LOAI = "^HL-[0-9]{2}$";
    private static final String REGEX_SOLUONG = "^[0-9]+$";
    private static final String REGEX_DIACHI = "^[A-Za-z0-9, ]{5,50}$";

    private static final Scanner scanner = new Scanner(System.in);

    public static String kiemTraId() {
        while (true) {
            System.out.print("Nhập ID (theo format ID-1234): ");
            String id = scanner.nextLine();
            if (id.matches(REGEX_ID)) {
                return id;
            } else {
                System.out.println("ID không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public static String kiemTraName() {
        while (true) {
            System.out.print("Nhập tên (từ 4 đến 30 ký tự): ");
            String name = scanner.nextLine();
            if (name.matches(REGEX_NAME)) {
                return name;
            } else {
                System.out.println("Tên không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public static double kiemTraGia() {
        while (true) {
            System.out.print("Nhập giá (số nguyên dương): ");
            String gia = scanner.nextLine();
            if (gia.matches(REGEX_GIA)) {
                return Double.parseDouble(gia);
            } else {
                System.out.println("Giá không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public static String kiemTraLoai() {
        while (true) {
            System.out.print("Nhập loại (theo format HL-12): ");
            String loai = scanner.nextLine();
            if (loai.matches(REGEX_LOAI)) {
                return loai;
            } else {
                System.out.println("Loại không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public static int kiemTraSoluong() {
        while (true) {
            System.out.print("Nhập số lượng (số nguyên dương): ");
            String soluong = scanner.nextLine();
            if (soluong.matches(REGEX_SOLUONG)) {
                return Integer.parseInt(soluong);
            } else {
                System.out.println("Số lượng không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }

    public static String kiemTraDiachi() {
        while (true) {
            System.out.print("Nhập địa chỉ (từ 10 đến 50 ký tự): ");
            String diachi = scanner.nextLine();
            if (diachi.matches(REGEX_DIACHI)) {
                return diachi;
            } else {
                System.out.println("Địa chỉ không hợp lệ. Vui lòng nhập lại.");
            }
        }
    }
}
