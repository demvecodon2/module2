package case_study_module2.view;

import case_study_module2.controllers.NguoiMuaController;
import case_study_module2.controllers.ThucPhamController;

import case_study_module2.controllers.HoaDonController;
import case_study_module2.repository.SanPhamRepo;


import case_study_module2.repository.hoa_don.HoaDonRepoImpl;

import java.util.Scanner;



public class QuanLyThucPham {
    private static Scanner scanner = new Scanner(System.in);
    private static ThucPhamController thucPhamController = new ThucPhamController(new SanPhamRepo());
    private static HoaDonController hoaDonController = new HoaDonController(new HoaDonRepoImpl());

    public static void main(String[] args) {
        while (true) {
            System.out.println("CHƯƠNG TRÌNH QUẢN LÝ");
            System.out.println("CHỌN CHỨC NĂNG BẠN MUỐN");
            System.out.println("1: QUẢN LÝ THỰC PHẨM");
            System.out.println("2: XEM NGƯỜI MUA");
            System.out.println("3: XEM HOÁ ĐƠN");
            System.out.println("4: THOÁT");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    quanLyThucPham();
                    break;
                case 2:

                    NguoiMuaController.displayNguoiTieuDung();
                    break;
                case 3:
                    hoaDonController.displayHoaDon();
                    break;
                case 4:
                    System.out.println("Đã thoát chương trình.");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }

    private static void displayNguoiTieuDung() {
    }

    private static void quanLyThucPham() {
        while (true) {
            System.out.println("QUẢN LÝ THỰC PHẨM");
            System.out.println("1: HIỂN THỊ SẢN PHẨM");
            System.out.println("2: THÊM MỚI THỰC PHẨM");
            System.out.println("3: CHỈNH SỬA THỰC PHẨM");
            System.out.println("4: TÌM KIẾM THỰC PHẨM");
            System.out.println("5: XOÁ THỰC PHẨM");
            System.out.println("6: QUAY LẠI");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    thucPhamController.hienThiSanPham();
                    break;
                case 2:
                    thucPhamController.themMoiThucPham();
                    break;
                case 3:
                    thucPhamController.chinhSuaSanPham();
                    break;
                case 4:
                    thucPhamController.timKiemThucPham();
                    break;
                case 5:
                    thucPhamController.xoaThucPham();
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
    }
}
