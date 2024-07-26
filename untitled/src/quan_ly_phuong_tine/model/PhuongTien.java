package quan_ly_phuong_tine.model;

import java.time.LocalDate;

public abstract class PhuongTien {
    private String bienKiemSoat;
    private HangSanXuat hangSanXuat;
    private LocalDate ngaySanXuat;
    private String chuSoHuu;

    public PhuongTien(String bienKiemSoat, HangSanXuat hangSanXuat, LocalDate ngaySanXuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.hangSanXuat = hangSanXuat;
        this.ngaySanXuat = ngaySanXuat;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public HangSanXuat getHangSanXuat() {
        return hangSanXuat;
    }

    public LocalDate getNgaySanXuat() {
        return ngaySanXuat;
    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    @Override
    public String toString() {
        return "Biển kiểm soát: " + bienKiemSoat + " | Hãng sản xuất: " + hangSanXuat + " | Ngày sản xuất: " + ngaySanXuat + " | Chủ sở hữu: " + chuSoHuu;
    }
}