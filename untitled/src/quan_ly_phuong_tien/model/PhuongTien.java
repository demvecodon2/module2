package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public abstract class PhuongTien {
    public String bienKiemSoat;
    private String tenHang;
    private LocalDate ngaySanSuat;
    private String chuSoHuu;
    public PhuongTien(String bienKiemSoat, String tenHang, LocalDate ngaySanSuat, String chuSoHuu) {
        this.bienKiemSoat = bienKiemSoat;
        this.tenHang = tenHang;
        this.ngaySanSuat = ngaySanSuat; ;
        this.chuSoHuu = chuSoHuu;
    }

    public String getBienKiemSoat() {
        return bienKiemSoat;
    }

    public void setBienKiemSoat(String bienKiemSoat) {
        this.bienKiemSoat = bienKiemSoat;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public LocalDate getNgaySanSuat() {
        return ngaySanSuat;
    }

    public void setNgaySanSuat(LocalDate ngaySanSuat) {
                this.ngaySanSuat = ngaySanSuat;    }

    public String getChuSoHuu() {
        return chuSoHuu;
    }

    public void setChuSoHuu(String chuSoHuu) {
        this.chuSoHuu = chuSoHuu;
    }

    @Override
    public String toString() {
        return "biển kiểm soast"+bienKiemSoat+'\n'+
                "tên hãng xe="+tenHang+'\n'+
                "ngày sản suất= "+ngaySanSuat+'\n'+
                "chủ sở hữu="+chuSoHuu+'}';
    }

    
   
}
