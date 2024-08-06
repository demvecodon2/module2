package case_study_module2.model;

import java.time.LocalDate;

public class CuaHang extends CacLoaiThucPham{
    private LocalDate ngayNhap;
    private String tenCuaHang;

    public CuaHang(int ma, String tenThucPham, String giaThucPham, String loaiThucPham, String soLuongThucPham,LocalDate ngayNhap, String tenCuaHang, String diaDiem) {
        super(ma, tenThucPham, giaThucPham, loaiThucPham, soLuongThucPham,diaDiem);
        this.ngayNhap = ngayNhap;
        this.tenCuaHang = tenCuaHang;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public String getTenCuaHang() {
        return tenCuaHang;
    }

    public void setTenCuaHang(String tenCuaHang) {
        this.tenCuaHang = tenCuaHang;
    }

    @Override
    public String toString() {
        return "CuaHang{" +
                "ngayNhap=" + ngayNhap +
                ", tenCuaHang='" + tenCuaHang + '\'' +
                '}';
    }
}
