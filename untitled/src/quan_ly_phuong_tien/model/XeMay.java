package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public class XeMay extends PhuongTien {
    private String CongSuat;

    public XeMay(String bienKiemSoat, String tenHang, LocalDate ngaySanSuat, String chuSoHuu, String congSuat) {
        super(bienKiemSoat, tenHang, ngaySanSuat, chuSoHuu);
        CongSuat = congSuat;
    }

    public String getCongSuat() {
        return CongSuat;
    }
    public void setCongSuat(String congSuat) {
        CongSuat = congSuat;
    }
    public String toString() {
        return super.toString()+ "công suất của xe máy "+CongSuat;
    }
}
