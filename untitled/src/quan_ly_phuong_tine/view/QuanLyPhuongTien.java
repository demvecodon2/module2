package quan_ly_phuong_tine.view;

import quan_ly_phuong_tine.model.HangSanXuat;
import quan_ly_phuong_tine.model.Oto;
import quan_ly_phuong_tine.model.XeMay;
import quan_ly_phuong_tine.model.XeTai;
import quan_ly_phuong_tine.sevirce.Oto.IOtoService;
import quan_ly_phuong_tine.sevirce.Oto.OtoService;

import quan_ly_phuong_tine.sevirce.xe_may.XeMayService;
import quan_ly_phuong_tine.sevirce.xe_tai.IXeTaiService;
import quan_ly_phuong_tine.sevirce.xe_tai.XeTaiService;

import java.time.LocalDate;
import java.util.Scanner;

public class QuanLyPhuongTien {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IOtoService otoService = new OtoService();
    private static final tham_khao.sevirce.XeMay.IXeMayService xeMayService = new XeMayService();
    private static final IXeTaiService xeTaiService = new XeTaiService();

    public static void main(String[] args) {
        while (true) {
            System.out.println("Chọn chức năng:");
            System.out.println("1. Thêm mới phương tiện");
            System.out.println("2. Hiển thị danh sách phương tiện");
            System.out.println("3. Xoá phương tiện");
            System.out.println("4. Tìm kiếm phương tiện");
            System.out.println("5. Thoát");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    themMoiPhuongTien();
                    break;
                case 2:
                    hienThiDanhSachPhuongTien();
                    break;
                case 3:
                    xoaPhuongTien();
                    break;
                case 4:
                    timKiemPhuongTien();
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Lựa chọn không hợp lệ");
            }
        }
    }

    private static void themMoiPhuongTien() {
        System.out.println("Chọn loại phương tiện cần thêm:");
        System.out.println("1. Thêm ôtô");
        System.out.println("2. Thêm xe máy");
        System.out.println("3. Thêm xe tải");
        int addChoice = Integer.parseInt(scanner.nextLine());
        switch (addChoice) {
            case 1:
                themOto();
                break;
            case 2:
                themXeMay();
                break;
            case 3:
                themXeTai();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }

    private static void themOto() {
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập kiểu xe:");
        String kieuXe = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi:");
        int choNgoi = Integer.parseInt(scanner.nextLine());

        // Example HangSanXuat, you should replace this with actual data
        HangSanXuat hangSanXuat = new HangSanXuat("HSX1", "Toyota", "Japan");
        Oto oto = new Oto(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, choNgoi, kieuXe);
        otoService.themOto(oto);
    }

    private static void themXeMay() {
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập công suất:");
        double congSuat = Double.parseDouble(scanner.nextLine());

        // Example HangSanXuat, you should replace this with actual data
        HangSanXuat hangSanXuat = new HangSanXuat("HSX1", "Honda", "Japan");
        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, congSuat);
        xeMayService.themXeMay(xeMay);
    }

    private static void themXeTai() {
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập tải trọng:");
        double taiTrong = Double.parseDouble(scanner.nextLine());

        // Example HangSanXuat, you should replace this with actual data
        HangSanXuat hangSanXuat = new HangSanXuat("HSX2", "Ford", "USA");
        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, taiTrong);
        xeTaiService.themXeTai(xeTai);
    }

    private static void hienThiDanhSachPhuongTien() {
        System.out.println("Chọn loại phương tiện để hiện thị:");
        System.out.println("1. Hiện thị xe tải");
        System.out.println("2. Hiện thị ôtô");
        System.out.println("3. Hiện thị xe máy");
        int displayChoice = Integer.parseInt(scanner.nextLine());
        switch (displayChoice) {
            case 1:
                hienThiXeTai();
                break;
            case 2:
                hienThiOto();
                break;
            case 3:
                hienThiXeMay();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }

    private static void hienThiXeTai() {
        for (XeTai xeTai : xeTaiService.hienThiXeTai()) {
            System.out.println(xeTai);
        }
    }

    private static void hienThiOto() {
        for (Oto oto : otoService.hienThiOto()) {
            System.out.println(oto);
        }
    }

    private static void hienThiXeMay() {
        for (XeMay xeMay : xeMayService.hienThiXeMay()) {
            System.out.println(xeMay);
        }
    }

    private static void xoaPhuongTien() {
        System.out.println("Chọn loại phương tiện cần xoá:");
        System.out.println("1. Xoá xe tải");
        System.out.println("2. Xoá ôtô");
        System.out.println("3. Xoá xe máy");
        int deleteChoice = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();
        switch (deleteChoice) {
            case 1:
                xeTaiService.xoaXeTai(bienKiemSoat);
                break;
            case 2:
                otoService.xoaOto(bienKiemSoat);
                break;
            case 3:
                xeMayService.xoaXeMay(bienKiemSoat);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }

    private static void timKiemPhuongTien() {
        System.out.println("Nhập biển kiểm soát cần tìm:");
        String bienKiemSoat = scanner.nextLine();

        XeTai xeTai = xeTaiService.timKiemXeTai(bienKiemSoat);
        if (xeTai != null) {
            System.out.println("Tìm thấy xe tải:");
            System.out.println(xeTai);
            return;
        }

        Oto oto = otoService.timKiemOto(bienKiemSoat);
        if (oto != null) {
            System.out.println("Tìm thấy ôtô:");
            System.out.println(oto);
            return;
        }

        XeMay xeMay = xeMayService.timKiemXeMay(bienKiemSoat);
        if (xeMay != null) {
            System.out.println("Tìm thấy xe máy:");
            System.out.println(xeMay);
            return;
        }

        System.out.println("Không có phương tiện nào được tìm thấy.");
    }
}
