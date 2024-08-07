package case_study_module2.controllers;

import case_study_module2.model.CacLoaiThucPham;
import case_study_module2.momo.RegexHandler;
import case_study_module2.repository.ISanPhamRepo;

import java.util.List;
import java.util.Scanner;

public class ThucPhamController {
    private final ISanPhamRepo sanPhamRepo;

    public ThucPhamController(ISanPhamRepo sanPhamRepo) {
        this.sanPhamRepo = sanPhamRepo;
        Scanner scanner = new Scanner(System.in);
    }

    public void hienThiSanPham() {
        List<CacLoaiThucPham> danhSachSanPham = sanPhamRepo.findAll();
        if (danhSachSanPham.isEmpty()) {
            System.out.println("Không có sản phẩm nào.");
        } else {
            System.out.println("Danh sách các loại sản phẩm:");
            for (CacLoaiThucPham thucPham : danhSachSanPham) {
                System.out.println(thucPham);
            }
        }
    }

    public void themMoiThucPham() {
        System.out.println("NHẬP MÃ SẢN PHẨM");
        int ma = Integer.parseInt(RegexHandler.kiemTraId());
        System.out.print("Nhập tên: ");
        String ten = RegexHandler.kiemTraName();
        System.out.print("Nhập giá: ");
        String gia = String.valueOf(RegexHandler.kiemTraGia());
        System.out.print("Nhập loại sản phẩm: ");
        String loai = RegexHandler.kiemTraLoai();
        System.out.print("Nhập số lượng sản phẩm: ");
        String soLuong = String.valueOf(RegexHandler.kiemTraSoluong());
        System.out.print("Nhập địa điểm hàng hóa: ");
        String diaDiem = RegexHandler.kiemTraDiachi();
        CacLoaiThucPham thucPham = new CacLoaiThucPham(ma, ten, gia, loai, soLuong, diaDiem);
        sanPhamRepo.themSanPham(thucPham);
        System.out.println("Đã thêm mới sản phẩm thành công.");
    }

    public void chinhSuaSanPham() {
        System.out.print("Nhập mã sản phẩm cần chỉnh sửa: ");
        int ma = Integer.parseInt(RegexHandler.kiemTraId());
        CacLoaiThucPham thucPham = sanPhamRepo.findMa(ma);
        if (thucPham != null) {
            System.out.println("Thông tin sản phẩm cần chỉnh sửa:");
            System.out.println(thucPham);
            System.out.print("Nhập tên mới: ");
            String tenMoi = RegexHandler.kiemTraName();
            System.out.print("Nhập giá mới: ");
            String giaMoi = String.valueOf(RegexHandler.kiemTraGia());
            System.out.print("Nhập loại mới: ");
            String loaiMoi = RegexHandler.kiemTraLoai();
            System.out.print("Nhập số lượng mới: ");
            String soLuongMoi = String.valueOf(RegexHandler.kiemTraSoluong());
            System.out.print("Nhập địa điểm mới: ");
            String diaDiemMoi = RegexHandler.kiemTraDiachi();

            thucPham.setTenThucPham(tenMoi);
            thucPham.setGiaThucPham(giaMoi);
            thucPham.setLoaiThucPham(loaiMoi);
            thucPham.setSoLuongThucPham(soLuongMoi);
            thucPham.setDiaDiem(diaDiemMoi);

            sanPhamRepo.update(thucPham);
            System.out.println("Đã cập nhật sản phẩm thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm có mã " + ma);
        }
    }

    public void timKiemThucPham() {
        System.out.print("Nhập mã sản phẩm cần tìm kiếm: ");
        int ma = Integer.parseInt(RegexHandler.kiemTraId());

        CacLoaiThucPham thucPham = sanPhamRepo.findMa(ma);
        if (thucPham != null) {
            System.out.println("Thông tin sản phẩm:");
            System.out.println(thucPham);
        } else {
            System.out.println("Không tìm thấy sản phẩm có mã " + ma);
        }
    }

    public void xoaThucPham() {
        System.out.print("Nhập mã sản phẩm cần để xoá: ");
        int ma = Integer.parseInt(RegexHandler.kiemTraId());
        boolean xoaThanhCong = sanPhamRepo.xoaSanPham(ma);
        if (xoaThanhCong) {
            System.out.println("Sản phẩm đã được xóa thành công.");
        } else {
            System.out.println("Không tìm thấy sản phẩm có mã " + ma);
        }
    }
}
