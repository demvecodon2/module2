package case_study_module2.model;

public class ChiTietHoaDon {
    private int maSanPham;
    private int soLuong;
    private double tongTien;
    // Constructor
    public ChiTietHoaDon(int maSanPham, int soLuong,double tongTien) {
        this.maSanPham = maSanPham;
        this.soLuong = soLuong;
        this.tongTien = tongTien;
    }
    public double getTongTien() {
        return tongTien;
    }
    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return "ChiTietHoaDon{" +
                "maSanPham=" + maSanPham +
                ", soLuong=" + soLuong +
                ", tongTien=" + tongTien +
                '}';
    }
}
