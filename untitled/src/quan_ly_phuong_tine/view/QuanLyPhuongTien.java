package quan_ly_phuong_tine.view;

import quan_ly_phuong_tine.model.HangSanXuat;
import quan_ly_phuong_tine.model.Oto;
import quan_ly_phuong_tine.model.XeMay;
import quan_ly_phuong_tine.model.XeTai;
import quan_ly_phuong_tine.sevirce.Oto.IOtoService;
import quan_ly_phuong_tine.sevirce.Oto.OtoService;
import quan_ly_phuong_tine.sevirce.xe_may.IXeMayService;
import quan_ly_phuong_tine.sevirce.xe_may.XeMayService;
import quan_ly_phuong_tine.sevirce.xe_tai.IXeTaiService;
import quan_ly_phuong_tine.sevirce.xe_tai.XeTaiService;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class QuanLyPhuongTien {
    private static final Scanner scanner = new Scanner(System.in);
    private static final IOtoService otoService = new OtoService();
    private static final IXeMayService xeMayService = new XeMayService();
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

    private static void hienThiDanhSachPhuongTien() {
        System.out.println("Danh sách ô tô:");
        List<Oto> otoList = otoService.hienThiOto();
        otoList.forEach(System.out::println);

        System.out.println("Danh sách xe máy:");
        List<XeMay> xeMayList = xeMayService.hienThiXeMay();
        xeMayList.forEach(System.out::println);

        System.out.println("Danh sách xe tải:");
        List<XeTai> xeTaiList = xeTaiService.hienThiXeTai();
        xeTaiList.forEach(System.out::println);
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

        int namSanXuat = -1;
        boolean isValid = false;
        while (!isValid) {
            System.out.println("Nhập năm sản xuất (ví dụ: 2024):");
            try {
                namSanXuat = Integer.parseInt(scanner.nextLine());
                int currentYear = LocalDate.now().getYear();
                if (namSanXuat >= 1900 && namSanXuat <= currentYear) {
                    isValid = true;
                } else {
                    System.out.println("Năm sản xuất không hợp lệ. Vui lòng nhập một năm từ 1900 đến " + currentYear + ".");
                }
            } catch (NumberFormatException e) {
                System.out.println("Định dạng năm không hợp lệ. Vui lòng nhập một số nguyên.");
            }
        }

        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();
        System.out.println("Nhập kiểu xe:");
        String kieuXe = scanner.nextLine();
        System.out.println("Nhập số chỗ ngồi:");
        int choNgoi = Integer.parseInt(scanner.nextLine());

        HangSanXuat hangSanXuat = new HangSanXuat("HSX1", "Toyota", "Japan");
        Oto oto = new Oto(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, choNgoi, kieuXe);
        otoService.themOto(oto);
        System.out.println("Đã thêm ô tô mới thành công!");
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

        HangSanXuat hangSanXuat = new HangSanXuat("HSX1", "Honda", "Japan");
        XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, congSuat);
        xeMayService.themXeMay(xeMay);
        System.out.println("Đã thêm xe máy mới thành công!");
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

        HangSanXuat hangSanXuat = new HangSanXuat("HSX2", "Ford", "USA");
        XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, taiTrong);
        xeTaiService.themXeTai(xeTai);
        System.out.println("Đã thêm xe tải mới thành công!");
    }

    private static void timKiemPhuongTien() {
        System.out.println("Nhập ký tự hoặc biển kiểm soát cần tìm:");
        String kieuTimKiem = scanner.nextLine();

        List<XeTai> xeTaiList = xeTaiService.timKiemXeTaiTheoKitu(kieuTimKiem);
        if (!xeTaiList.isEmpty()) {
            System.out.println("Danh sách xe tải tìm thấy:");
            xeTaiList.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy xe tải nào.");
        }

        List<Oto> otoList = otoService.timKiemOtoTheoKitu(kieuTimKiem);
        if (!otoList.isEmpty()) {
            System.out.println("Danh sách ô tô tìm thấy:");
            otoList.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy ô tô nào.");
        }

        List<XeMay> xeMayList = xeMayService.timKiemXeMayTheoKitu(kieuTimKiem);
        if (!xeMayList.isEmpty()) {
            System.out.println("Danh sách xe máy tìm thấy:");
            xeMayList.forEach(System.out::println);
        } else {
            System.out.println("Không tìm thấy xe máy nào.");
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
                System.out.println("Đã xóa xe tải với biển kiểm soát: " + bienKiemSoat);
                break;
            case 2:
                otoService.xoaOto(bienKiemSoat);
                System.out.println("Đã xóa ô tô với biển kiểm soát: " + bienKiemSoat);
                break;
            case 3:
                xeMayService.xoaXeMay(bienKiemSoat);
                System.out.println("Đã xóa xe máy với biển kiểm soát: " + bienKiemSoat);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ");
        }
    }
}
