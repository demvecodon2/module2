package quan_ly_phuong_tien.view;

import quan_ly_phuong_tien.sevirce.Oto.IOtoService;
import quan_ly_phuong_tien.sevirce.Oto.OtoService;

import java.util.Scanner;

import static quan_ly_phuong_tien.controllers.PhuongTienControllers.*;

public class QuanLyPhuongTien {

    private static final Scanner scanner = new Scanner(System.in);
    private static final IOtoService otoService = new OtoService();

    public static void main(String[] args) {
        int choice;
        do {
            System.out.println("Quản lý phương tiện:\n" +
                    "1. Quản lý Oto\n" +
                    "2. Quản lý xe tải\n" +
                    "3. Quản lý xe máy\n" +
                    "4. Thoát chương trình\n" +
                    "Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    quanLyOto();
                    break;
                case 2:
                    quanLyXeTai();
                    break;
                case 3:
                    quanLyXeMay();
                    break;
                case 4:
                    System.out.println("THOÁT CHƯƠNG TRÌNH");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        } while (true);
    }

    private static void quanLyXeMay() {
    }

    private static void quanLyXeTai() {
    }

    private static void quanLyOto() {
        int choice;
        do {
            System.out.println("Quản lý oto:\n" +
                    "1. Thêm oto\n" +
                    "2. Xóa Oto\n" +
                    "3. Hiển thị danh sách oto\n" +
                    "4. Quay lại\n" +
                    "Nhập lựa chọn của bạn:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    themOto();
                    break;
                case 2:
                    xoaOto();
                    break;
                case 3:
                    hienThiOto();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Lựa chọn của bạn không hợp lệ");
            }
        } while (true);
    }



}
