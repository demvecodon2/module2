package quan_ly_phuong_tine.model;

import java.time.LocalDate;

public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(String bienKiemSoat, HangSanXuat hangSanXuat, LocalDate ngaySanXuat, String chuSoHuu, double congSuat) {
        super(bienKiemSoat, hangSanXuat, ngaySanXuat, chuSoHuu);
        this.congSuat = congSuat;
    }

    public double getCongSuat() {
        return congSuat;
    }

    public void setCongSuat(double congSuat) {
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + " | Công suất: " + congSuat + " HP";
    }
}
