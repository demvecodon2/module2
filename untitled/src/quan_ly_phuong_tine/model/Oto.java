package quan_ly_phuong_tine.model;

import java.time.LocalDate;

public class Oto extends PhuongTien {
    private int soChoNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, HangSanXuat hangSanXuat, LocalDate ngaySanXuat, String chuSoHuu, int soChoNgoi, String kieuXe) {
        super(bienKiemSoat, hangSanXuat, ngaySanXuat, chuSoHuu);
        this.soChoNgoi = soChoNgoi;
        this.kieuXe = kieuXe;
    }

    public int getSoChoNgoi() {
        return soChoNgoi;
    }

    public void setSoChoNgoi(int soChoNgoi) {
        this.soChoNgoi = soChoNgoi;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public void setKieuXe(String kieuXe) {
        this.kieuXe = kieuXe;
    }

    @Override
    public String toString() {
        return super.toString() + " | Số chỗ ngồi: " + soChoNgoi + " | Kiểu xe: " + kieuXe;
    }
}