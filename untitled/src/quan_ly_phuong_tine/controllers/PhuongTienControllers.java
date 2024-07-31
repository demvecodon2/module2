package quan_ly_phuong_tine.controllers;

import quan_ly_phuong_tine.model.HangSanXuat;
import quan_ly_phuong_tine.model.Oto;
import quan_ly_phuong_tine.model.XeMay;
import quan_ly_phuong_tine.model.XeTai;
import quan_ly_phuong_tine.repository.oto.OtoRepository;
import quan_ly_phuong_tine.sevirce.Oto.IOtoService;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienControllers {
    private static List<XeTai> xeTaiList = new ArrayList<>();
    private static List<Oto> otoList = new ArrayList<>();
    private static List<XeMay> xeMayList = new ArrayList<>();
    private static List<HangSanXuat> hangSanXuatList = new ArrayList<>();
    private static IOtoService otoRepository = (IOtoService) new OtoRepository(otoList);
    private static final Scanner scanner = new Scanner(System.in);

    static {
        hangSanXuatList.add(new HangSanXuat("HSX1", "Toyota", "Japan"));
        hangSanXuatList.add(new HangSanXuat("HSX2", "Ford", "USA"));
        hangSanXuatList.add(new HangSanXuat("HSX3", "Honda", "Japan"));
    }

    public static void themPhuongTien() {
        System.out.println("Chọn loại phương tiện:");
        System.out.println("1. Thêm xe tải");
        System.out.println("2. Thêm ôtô");
        System.out.println("3. Thêm xe máy");
        int choice = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập biển kiểm soát:");
        String bienKiemSoat = scanner.nextLine();

        System.out.println("Chọn hãng sản xuất:");
        for (int i = 0; i < hangSanXuatList.size(); i++) {
            System.out.println((i + 1) + ". " + hangSanXuatList.get(i).getTenHang() + " (" + hangSanXuatList.get(i).getQuocGia() + ")");
        }
        int hangChoice = Integer.parseInt(scanner.nextLine()) - 1;
        if (hangChoice < 0 || hangChoice >= hangSanXuatList.size()) {
            System.out.println("Lựa chọn không hợp lệ.");
            return;
        }
        HangSanXuat hangSanXuat = hangSanXuatList.get(hangChoice);

        System.out.println("Nhập năm sản xuất:");
        int namSanXuat = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên chủ sở hữu:");
        String chuSoHuu = scanner.nextLine();

        switch (choice) {
            case 1: // Xe tải
                System.out.println("Nhập tải trọng:");
                double taiTrong = Double.parseDouble(scanner.nextLine());
                XeTai xeTai = new XeTai(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, taiTrong);
                xeTaiList.add(xeTai);
                break;
            case 2: // Ôtô
                System.out.println("Nhập kiểu xe:");
                String kieuXe = scanner.nextLine();
                System.out.println("Nhập số chỗ ngồi:");
                int choNgoi = Integer.parseInt(scanner.nextLine());
                Oto oto = new Oto(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, choNgoi, kieuXe);
                otoList.add(oto);
                break;
            case 3: // Xe máy
                System.out.println("Nhập công suất:");
                double congSuat = Double.parseDouble(scanner.nextLine());
                XeMay xeMay = new XeMay(bienKiemSoat, hangSanXuat, LocalDate.of(namSanXuat, 1, 1), chuSoHuu, congSuat);
                xeMayList.add(xeMay);
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    public static void hienThiPhuongTien() {
        System.out.println("Chọn loại phương tiện để hiện thị:");
        System.out.println("1. Hiện thị xe tải");
        System.out.println("2. Hiện thị ôtô");
        System.out.println("3. Hiện thị xe máy");
        int choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                if (xeTaiList.isEmpty()) {
                    System.out.println("Danh sách xe tải trống.");
                } else {
                    System.out.println("Danh sách xe tải:");
                    for (XeTai xeTai : xeTaiList) {
                        System.out.println(xeTai);
                    }
                }
                break;
            case 2:
                if (otoList.isEmpty()) {
                    System.out.println("Danh sách ôtô trống.");
                } else {
                    System.out.println("Danh sách ôtô:");
                    for (Oto oto : otoList) {
                        System.out.println(oto);
                    }
                }
                break;
            case 3:
                if (xeMayList.isEmpty()) {
                    System.out.println("Danh sách xe máy trống.");
                } else {
                    System.out.println("Danh sách xe máy:");
                    for (XeMay xeMay : xeMayList) {
                        System.out.println(xeMay);
                    }
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    public static void xoaPhuongTien() {
        System.out.println("Nhập biển kiểm soát cần xóa:");
        String bienKiemSoat = scanner.nextLine();
        boolean found = false;

        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                xeTaiList.remove(xeTai);
                found = true;
                break;
            }
        }

        for (Oto oto : otoList) {
            if (oto.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                otoList.remove(oto);
                found = true;
                break;
            }
        }

        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                xeMayList.remove(xeMay);
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Bạn có chắc chắn muốn xóa phương tiện này? (Yes/No)");
            String confirm = scanner.nextLine().trim().toLowerCase();
            if (confirm.equals("yes")) {
                System.out.println("Đã xóa thành công.");
            } else {
                System.out.println("Hủy bỏ thao tác xóa.");
            }
        } else {
            System.out.println("Không tìm thấy phương tiện với biển kiểm soát này.");
        }
    }

    public static void timKiemPhuongTien() {
        System.out.println("Nhập biển kiểm soát cần tìm:");
        String bienKiemSoat = scanner.nextLine();
        boolean found = false;

        System.out.println("Danh sách phương tiện tìm thấy:");

        for (XeTai xeTai : xeTaiList) {
            if (xeTai.getBienKiemSoat().toLowerCase().contains(bienKiemSoat.toLowerCase())) {
                System.out.println(xeTai);
                found = true;
            }
        }

        for (Oto oto : otoList) {
            if (oto.getBienKiemSoat().toLowerCase().contains(bienKiemSoat.toLowerCase())) {
                System.out.println(oto);
                found = true;
            }
        }

        for (XeMay xeMay : xeMayList) {
            if (xeMay.getBienKiemSoat().toLowerCase().contains(bienKiemSoat.toLowerCase())) {
                System.out.println(xeMay);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không có phương tiện nào được tìm thấy.");
        }
    }

    public void themXeTai() {

        System.out.println("Thêm xe tải:");
        themPhuongTien();
    }

    public void themXeMay() {

        System.out.println("Thêm xe máy:");
        themPhuongTien();
    }

    public void themOto() {

        System.out.println("Thêm ôtô:");
        themPhuongTien();
    }

    public void hienThiXeTai() {
        hienThiPhuongTien();
    }

    public void hienThiOto() {
        hienThiPhuongTien();
    }

    public void hienThiXeMay() {
        hienThiPhuongTien();
    }
}
