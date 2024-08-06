package hoa_don_tien_dien.view;

import case_study_module2.controllers.NguoiMuaController;
import case_study_module2.repository.nguoi_mua.INguoiMuaRepo;
import case_study_module2.repository.nguoi_mua.NguoiMuaRepoImpl;
import hoa_don_tien_dien.controllers.KhachHangController;
import hoa_don_tien_dien.controllers.HoaDonController;
import java.io.IOException;
import java.util.Scanner;

    public class Main {
        public static void main(String[] args) throws IOException {
            KhachHangController khachHangController = new KhachHangController();
            HoaDonController hoaDonController = new HoaDonController();
            INguoiMuaRepo nguoiMuaRepo = new NguoiMuaRepoImpl();
            NguoiMuaController nguoiMuaController = new NguoiMuaController();

            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("CHƯƠNG TRÌNH QUẢN LÝ HÓA ĐƠN TIỀN ĐIỆN");
                System.out.println("Chọn chức năng:");
                System.out.println("1. Thêm mới khách hàng.");
                System.out.println("2. Hiển thị thông tin khách hàng");
                System.out.println("3. Tìm kiếm khách hàng");
                System.out.println("4. Thêm mới hóa đơn");
                System.out.println("5. Chỉnh sửa hóa đơn");
                System.out.println("6. Hiển thị thông tin chi tiết hóa đơn");
                System.out.println("7. Thoát");
                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        try {
                            khachHangController.themKhachHang();
                        } catch (IOException e) {
                            System.out.println("Lỗi khi thêm khách hàng: " + e.getMessage());
                        }
                        break;
                    case 2:
                        khachHangController.hienThiKhachHang();
                        break;
                    case 3:
                        System.out.println("Nhập tên khách hàng để tìm kiếm:");
                        String tenKhachHang = scanner.nextLine();
                        khachHangController.timKiemKhachHang(tenKhachHang);
                        break;
                    case 4:
                        try {
                            hoaDonController.themHoaDon();
                        } catch (IOException e) {
                            System.out.println("Lỗi khi thêm hóa đơn: " + e.getMessage());
                        }
                        break;
                    case 5:
                        System.out.println("Nhập mã hóa đơn cần chỉnh sửa:");
                        String maHoaDon = scanner.nextLine();
                        hoaDonController.chinhSuaHoaDon(maHoaDon);
                        break;
                    case 6:
                        System.out.println("Nhập mã hóa đơn để hiển thị thông tin chi tiết:");
                        String maHoaDonChiTiet = scanner.nextLine();
                        hoaDonController.hienThiChiTietHoaDon(maHoaDonChiTiet);
                        break;
                    case 7:
                        System.out.println("Thoát chương trình.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
                }
            }
        }
    }
