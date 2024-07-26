package quan_ly_phuong_tine.model;

import java.time.LocalDate;

public class XeTai extends PhuongTien {
    private double taiTrong;

    public XeTai(String bienKiemSoat, HangSanXuat hangSanXuat, LocalDate ngaySanXuat, String chuSoHuu, double taiTrong) {
        super(bienKiemSoat, hangSanXuat, ngaySanXuat, chuSoHuu);
        this.taiTrong = taiTrong;
    }

    public double getTaiTrong() {
        return taiTrong;
    }

    public void setTaiTrong(double taiTrong) {
        this.taiTrong = taiTrong;
    }

    @Override
    public String toString() {
        return super.toString() + " | Tải trọng: " + taiTrong + " tấn";
    }
}