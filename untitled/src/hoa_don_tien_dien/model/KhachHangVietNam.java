package hoa_don_tien_dien.model;

public class KhachHangVietNam extends KhachHang {
    private String loaiKhachHang;
    private int mucTieuThu;

    public KhachHangVietNam(String maKhachHang, String tenKhachHang, String loaiKhachHang, int mucTieuThu) {
        super(maKhachHang, tenKhachHang, loaiKhachHang, mucTieuThu);
        this.loaiKhachHang = loaiKhachHang;
        this.mucTieuThu = mucTieuThu;
    }

    public KhachHangVietNam(String maKhachHang, String ten, int mucTieuThu, String loaiKhach) {
        super(maKhachHang, ten,loaiKhach, mucTieuThu);
        this.loaiKhachHang = loaiKhach;
        this.mucTieuThu = mucTieuThu;
    }

    public String getLoaiKhachHang() {
        return loaiKhachHang;
    }

    public void setLoaiKhachHang(String loaiKhachHang) {
        this.loaiKhachHang = loaiKhachHang;
    }

    public int getMucTieuThu() {
        return mucTieuThu;
    }

    public void setMucTieuThu(int mucTieuThu) {
        this.mucTieuThu = mucTieuThu;
    }

    @Override
    public String toString() {
        return "KhachHangVietNam{" +
                "maKhachHang='" + getMaKhachHang() + '\'' +
                ", tenKhachHang='" + getTenKhachHang() + '\'' +
                ", loaiKhachHang='" + loaiKhachHang + '\'' +
                ", mucTieuThu=" + mucTieuThu +
                '}';
    }
}
