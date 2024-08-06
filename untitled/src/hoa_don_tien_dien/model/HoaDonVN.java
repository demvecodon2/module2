package hoa_don_tien_dien.model;

import java.time.LocalDate;

public class HoaDonVN extends HoaDon {
    private int mucTieuThu;
    private int donGia;

    public HoaDonVN(String maHoaDon, String maKhachHang, LocalDate ngayRaHoaDon, int mucTieuThu, int donGia) {
        super(maHoaDon, maKhachHang,ngayRaHoaDon,mucTieuThu,donGia);
        this.mucTieuThu = mucTieuThu;
        this.donGia = donGia;
    }

    public int getMucTieuThu() {
        return mucTieuThu;
    }

    public void setMucTieuThu(int mucTieuThu) {
        this.mucTieuThu = mucTieuThu;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "HoaDonVN{" +
                "maHoaDon='" + getMaHoaDon() + '\'' +
                ", maKhachHang='" + getMaKhachHang() + '\'' +
                ", ngayRaHoaDon=" + getNgayRaHoaDon() +
                ", mucTieuThu=" + mucTieuThu +
                ", donGia=" + donGia +
                '}';
    }
}
