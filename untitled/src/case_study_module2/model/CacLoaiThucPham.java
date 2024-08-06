package case_study_module2.model;

import java.time.LocalDate;

public class CacLoaiThucPham {
    private int ma;
    private String tenThucPham;
    private String giaThucPham;
    private String loaiThucPham;
    private String soLuongThucPham;
    private String diaDiem;

    public CacLoaiThucPham(int ma, String tenThucPham, String giaThucPham, String loaiThucPham, String soLuongThucPham, String diaDiem) {
        this.ma = ma;
        this.tenThucPham = tenThucPham;
        this.giaThucPham = giaThucPham;
        this.loaiThucPham = loaiThucPham;
        this.soLuongThucPham = soLuongThucPham;
        this.diaDiem = diaDiem;
    }

    public CacLoaiThucPham(String maHoaDon, String maKhachHang, LocalDate ngayRaHoaDon, double soTienThanhToan) {
    }


    public static CacLoaiThucPham fromCSVString(String line) {
        String[] fields = line.split(",");
        if (fields.length != 6) {
            throw new IllegalArgumentException("Invalid CSV format for CacLoaiThucPham");
        }
        int ma = Integer.parseInt(fields[0]);
        String tenThucPham = fields[1];
        String giaThucPham = fields[2];
        String loaiThucPham = fields[3];
        String soLuongThucPham = fields[4];
        String diaDiem = fields[5];
        return new CacLoaiThucPham(ma, tenThucPham, giaThucPham, loaiThucPham, soLuongThucPham, diaDiem);
    }

    public String toCSVString() {
        return ma + "," + tenThucPham + "," + giaThucPham + "," + loaiThucPham + "," + soLuongThucPham + "," + diaDiem;
    }


    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTenThucPham() {
        return tenThucPham;
    }

    public void setTenThucPham(String tenThucPham) {
        this.tenThucPham = tenThucPham;
    }

    public String getGiaThucPham() {
        return giaThucPham;
    }

    public void setGiaThucPham(String giaThucPham) {
        this.giaThucPham = giaThucPham;
    }

    public String getLoaiThucPham() {
        return loaiThucPham;
    }

    public void setLoaiThucPham(String loaiThucPham) {
        this.loaiThucPham = loaiThucPham;
    }

    public String getSoLuongThucPham() {
        return soLuongThucPham;
    }

    public void setSoLuongThucPham(String soLuongThucPham) {
        this.soLuongThucPham = soLuongThucPham;
    }

    public String getDiaDiem() {
        return diaDiem;
    }

    public void setDiaDiem(String diaDiem) {
        this.diaDiem = diaDiem;
    }

    @Override
    public String toString() {
        return "CacLoaiThucPham{" +
                "ma=" + ma +
                ", tenThucPham='" + tenThucPham + '\'' +
                ", giaThucPham='" + giaThucPham + '\'' +
                ", loaiThucPham='" + loaiThucPham + '\'' +
                ", soLuongThucPham='" + soLuongThucPham + '\'' +
                ", diaDiem='" + diaDiem + '\'' +
                '}';
    }
}
