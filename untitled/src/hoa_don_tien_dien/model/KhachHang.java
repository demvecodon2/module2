package hoa_don_tien_dien.model;

public class KhachHang {
    private String maKhachHang;
    private String tenKhachHang;
    private String loaiKhachHang; // Added for Vietnamese customers
    private int mucTieuThu; // Added for Vietnamese customers
    private String quocTich; // Added for foreign customers

    // Constructor for Vietnamese customer
    public KhachHang(String maKhachHang, String tenKhachHang, String loaiKhachHang, int mucTieuThu) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.loaiKhachHang = loaiKhachHang;
        this.mucTieuThu = mucTieuThu;
    }

    // Constructor for foreign customer
    public KhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
        this.tenKhachHang = tenKhachHang;
        this.quocTich = quocTich;
    }

    public String getMaKhachHang() {
        return maKhachHang;
    }

    public void setMaKhachHang(String maKhachHang) {
        this.maKhachHang = maKhachHang;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
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

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        if (loaiKhachHang != null) { // Vietnamese customer
            return "KhachHangVietNam{" +
                    "maKhachHang='" + maKhachHang + '\'' +
                    ", tenKhachHang='" + tenKhachHang + '\'' +
                    ", loaiKhachHang='" + loaiKhachHang + '\'' +
                    ", mucTieuThu=" + mucTieuThu +
                    '}';
        } else { // Foreign customer
            return "KhachHangNuocNgoai{" +
                    "maKhachHang='" + maKhachHang + '\'' +
                    ", tenKhachHang='" + tenKhachHang + '\'' +
                    ", quocTich='" + quocTich + '\'' +
                    '}';
        }
    }
}
