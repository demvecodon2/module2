package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public class XeTai extends PhuongTien {
    private String trongTai;

    public XeTai(String bienKiemSoat, String tenHang, LocalDate ngaySanSuat, String chuSoHuu, String trongTai) {
        super(bienKiemSoat, tenHang, ngaySanSuat, chuSoHuu);
        this.trongTai = trongTai;
    }
    public String getTrongTai() {
        return trongTai;
    }
    public void setTrongTai(String trongTai) {
        this.trongTai = trongTai;
    }
    public String toString() {
        return "trọng lượng xe tải "+ trongTai;
    }
}
