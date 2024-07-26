package quan_ly_phuong_tine.model;

public class HangSanXuat {
    private String maHangSanXuat;
    private String tenHang;
    private String quocGia;

    public HangSanXuat(String maHangSanXuat, String tenHang, String quocGia) {
        this.maHangSanXuat = maHangSanXuat;
        this.tenHang = tenHang;
        this.quocGia = quocGia;
    }

    public String getMaHangSanXuat() {
        return maHangSanXuat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public String getQuocGia() {
        return quocGia;
    }

    @Override
    public String toString() {
        return tenHang + " (" + quocGia + ")";
    }
}