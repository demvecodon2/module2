package quan_ly_phuong_tien.controllers;

import quan_ly_phuong_tien.model.Oto;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhuongTienControllers {
    private static List<Oto> danhSachOto;
    private  static final Scanner scanner = new Scanner(System.in);
    private static final PhuongTienControllers phuongTienControllers = new PhuongTienControllers();


    public PhuongTienControllers() {
        danhSachOto = new ArrayList<>();
    }
    public void themOto(Oto oto) {
        danhSachOto.add(oto);
        System.out.println( "ĐÃ THÊM OTO :"+ oto);
    }
    public void xoaOto(String bienKiemSoat) {
        danhSachOto.remove(bienKiemSoat);
        for (Oto oto : danhSachOto) {
            if (oto.bienKiemSoat.equals(bienKiemSoat)) {
                danhSachOto.remove(oto);
                System.out.println("đã xoá OTO :"+ oto);
                return;
            }
        }
        System.out.println("không tim thấy biển kiê soát này :"+bienKiemSoat);
    }
    public static void hienThiOto() {
        if (danhSachOto.isEmpty()){
            System.out.println("Danh sách oto trống");
        }else {
            System.out.println("Danh sách oto:");
            for (Oto oto : danhSachOto) {
                System.out.println(oto);
            }
        }
    } public static void themOto() {
        System.out.println("Nhập biển kiểm soát");
        String bienKiemSoat  = scanner.next();
        System.out.println("Nhập tên hãng:");
        String tenHang = scanner.next();
        System.out.println("Nhập Ngày sản suất");
        LocalDate ngaySanSuat = LocalDate.parse(scanner.nextLine());
        System.out.println("Nhập tên chủ sở hữu");
        String tenChuSoHuu = scanner.next();
        System.out.println("nhập chỗ ngồi");
        String choNgoi= scanner.next();
        System.out.println("Nhập kiểu xe");
        String kieuXe = scanner.next();
        Oto oto= new Oto(bienKiemSoat,tenHang,ngaySanSuat,tenChuSoHuu,choNgoi,kieuXe);
        phuongTienControllers.themOto(oto);
    }
    public static void xoaOto(){
        System.out.println("Nhập biển số xe cần xoá");
        String bienXe = scanner.next();
        phuongTienControllers.xoaOto(bienXe);
    }

}
