package hoa_don_tien_dien.model;

import java.time.LocalDate;

public class HoaDon extends KhachHang {
    private String maHoaDon;
    private String maKhachHang;
    private LocalDate ngayRaHoaDon;
    private double soTienThanhToan;

    public HoaDon(String maHoaDon, String maKhachHang, LocalDate ngayRaHoaDon, double soTienThanhToan, int donGia) {
        super(maKhachHang);
        this.maHoaDon = maHoaDon;
        this.maKhachHang = maKhachHang;
        this.ngayRaHoaDon = ngayRaHoaDon;
        this.soTienThanhToan = soTienThanhToan;
    }

    public String getMaHoaDon() {
        return maHoaDon;
    }

    public void setMaHoaDon(String maHoaDon) {
        this.maHoaDon = maHoaDon;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public LocalDate getNgayRaHoaDon() {
        return ngayRaHoaDon;
    }

    public void setNgayRaHoaDon(LocalDate ngayRaHoaDon) {
        this.ngayRaHoaDon = ngayRaHoaDon;
    }

    public double getSoTienThanhToan() {
        return soTienThanhToan;
    }

    public void setSoTienThanhToan(double soTienThanhToan) {
        this.soTienThanhToan = soTienThanhToan;
    }

    @Override
    public String toString() {
        return "HoaDon{" +
                "maHoaDon='" + maHoaDon + '\'' +
                ", maKhachHang='" + maKhachHang + '\'' +
                ", ngayRaHoaDon=" + ngayRaHoaDon +
                ", soTienThanhToan=" + soTienThanhToan +
                '}';
    }
}
