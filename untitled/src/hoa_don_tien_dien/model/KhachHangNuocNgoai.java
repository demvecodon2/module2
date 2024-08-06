package hoa_don_tien_dien.model;

public class KhachHangNuocNgoai extends KhachHang {
    private String quocTich;

    public KhachHangNuocNgoai(String maKhachHang, String hoTen, String quocTich) {
        super(maKhachHang);
        this.quocTich = quocTich;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    @Override
    public String toString() {
        return "KhachHangNuocNgoai{" +
                "maKhachHang='" + getMaKhachHang() + '\'' +
                ", hoTen='" + getTenKhachHang() + '\'' +
                ", quocTich='" + quocTich + '\'' +
                '}';
    }
}
