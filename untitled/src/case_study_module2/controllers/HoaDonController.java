package case_study_module2.controllers;
import case_study_module2.model.CacLoaiThucPham;
import case_study_module2.model.HoaDon;
import case_study_module2.model.ChiTietHoaDon;
import case_study_module2.repository.hoa_don.HoaDonRepoImpl;
import case_study_module2.repository.hoa_don.IHoaDonRepo;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class HoaDonController {
    private static final String HOA_DON_FILE="src/case_study_module2/data/HoaDon.csv";
    private static final IHoaDonRepo hoaDonRepo= new HoaDonRepoImpl();
    private static final Scanner scanner = new Scanner(System.in);
    private static String maHoaDon;
    private static String maKhachHang;
    public HoaDonController(HoaDonRepoImpl hoaDonRepo) {
    }
    public static void displayHoaDon() {
        int choice;
        do {
            System.out.println("Quản lý Hoa Don");
            System.out.println("1. Hiển thị Hoá đơn");
            System.out.println("2. Thêm Hoá Đơn");
            System.out.println("3. Cập nhật hoá đơn");
            System.out.println("4. Xoá Hoá Đơn");
            System.out.println("5. Tìm Hoá đơn");
            System.out.println("6. chi tiết hoá đơn");
            System.out.println("7. Quay lại trang chủ");
                choice = scanner.nextInt();
                switch (choice) {
                    case 1:
                        hienThiHoaDon();
                        break;
                    case 2:
                        themHoaDon();
                        break;
                    case 3:
                        capNhatHoaDon();
                        break;
                    case 4:
                        xoaHoaDon();
                        break;
                    case 5:
                        timHoaDonTheoMa();
                        break;
                    case 6:
                        taoHoaDon();
                        break;
                    case 7:
                        System.out.println("quay lại tranng chủ");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. vui lòng chonj lại");

                }
            }while (true);
        }

    public static void hienThiHoaDon() {
        List<HoaDon> danhSachHoaDon = hoaDonRepo.findAll();
        if (danhSachHoaDon.isEmpty()) {
            System.out.println("Không có hóa đơn nào.");
        } else {
            System.out.println("Danh sách hóa đơn:");
            for (HoaDon hoaDon : danhSachHoaDon) {
                System.out.println(hoaDon);
            }
        }
    }
    public static void themHoaDon() {
        System.out.println("Nhập thông tin hoá đơn");
        System.out.println("Nhập mã");
        String maHoaDon= String.valueOf(scanner.nextInt());
        System.out.println("Nhập mã khách hàng");
        String maKhachHang= String.valueOf(scanner.nextInt());
        System.out.println("Nhập ngày ra hoá đơn");
        LocalDate ngayRaHoaDon = LocalDate.now();
        System.out.println("Nhập số tiền:");
        Double tinHoaDon=scanner.nextDouble();
        HoaDon hoaDon1=new HoaDon(maHoaDon,maKhachHang,ngayRaHoaDon,tinHoaDon);

        hoaDonRepo.add(hoaDon1);
        System.out.println("Thêm hóa đơn thành công.");
    }
    public static void capNhatHoaDon() {
        System.out.println("Nhập mã hoá đơn cần thay đôi");
        String maHoaDon= String.valueOf(scanner.nextInt());
        scanner.nextLine();
       HoaDon hoaDon1= hoaDonRepo.findById(maHoaDon);
       if (hoaDon1 != null) {
           System.out.println("thông tin cần chỉnh sửa");
           System.out.println(hoaDon1);
           System.out.println("Nhập mã mới");
           String maMoi=scanner.nextLine();
           System.out.println("Nhập mã khách hàng:");
           String maKhachHang=scanner.nextLine();
           System.out.println("Nhập ngày ra hoá đơn");
           LocalDate ngayRaHoaDon  = LocalDate.now();
           System.out.println("giá tiền thay đổi");
           double tinHoaDon=scanner.nextDouble();
           hoaDon1.setMa(Integer.parseInt(maMoi));
           hoaDon1.setMaKhachHang(maKhachHang);
           hoaDon1.getNgayRaHoaDon(ngayRaHoaDon);
           hoaDon1.getSoTienThanhToan(tinHoaDon);
           hoaDonRepo.add(hoaDon1);
           System.out.println(" ĐÃ SỬA THÀNH CÔNG ");
       }else {
           System.out.println("Không tim thấy sản phẩm có mã "+maHoaDon);
       }


    }


    public static void xoaHoaDon() {
        System.out.println("Nhập mã cần phải xoá");
        String maHoaDon= String.valueOf(scanner.nextInt());
        scanner.nextLine();
        boolean xoaThanhCong=hoaDonRepo.delete(maHoaDon);
        if(xoaThanhCong) {
            System.out.println("Đã xoá đơn thành conng");
        }
        hoaDonRepo.delete(maHoaDon);
        System.out.println("Xóa hóa đơn thành công.");
    }
    public static void timHoaDonTheoMa() {
        System.out.println("nhập mã hoá đơn cần tìm");
        String maHoaDon = String.valueOf(scanner.nextInt());
        scanner.nextLine();
        HoaDon hoaDon1 = hoaDonRepo.findById(maHoaDon);
        if (hoaDon1 != null) {
            System.out.println("THÔNG TIN SẢN PHẨM");
            System.out.println(hoaDon1);
        } else {
            System.out.println("KHÔNG TÌM THẤY SẢN PHẨM CÓ " + maHoaDon);
        }
    }
    private static void taoHoaDon() {
        double tongTien = 0;
        ChiTietHoaDon[] ChiTietHoaDon = new ChiTietHoaDon[0];
        for (ChiTietHoaDon chiTiet : ChiTietHoaDon) {

            CacLoaiThucPham sanPham = hoaDonRepo.findMa(chiTiet.getMaSanPham());
            if (sanPham != null) {
                double gia = Double.parseDouble(sanPham.getGiaThucPham());
                int soLuong = chiTiet.getSoLuong();
                tongTien += gia * soLuong;
            } else {
                System.out.println("Sản phẩm có mã " + chiTiet.getMaSanPham() + " không tồn tại.");
                return;
            }
        }
        HoaDon hoaDon = new HoaDon(maHoaDon, maKhachHang, LocalDate.now(), tongTien);
        hoaDonRepo.add(hoaDon);
        System.out.println("Hóa đơn đã được tạo thành công: " + hoaDon);
    }
    public static void setMaHoaDon(String maHoaDon) {
        HoaDonController.maHoaDon = maHoaDon;
    }
    public static void setMaKhachHang(String maKhachHang) {
        HoaDonController.maKhachHang = maKhachHang;
    }
}


