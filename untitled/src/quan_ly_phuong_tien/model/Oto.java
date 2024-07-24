package quan_ly_phuong_tien.model;

import java.time.LocalDate;

public class Oto extends PhuongTien {
    private int choNgoi;
    private String kieuXe;

    public Oto(String bienKiemSoat, String tenHang, LocalDate ngaySanSuat, String chuSoHuu, String choNgoi, String kieuXe) {
        super(bienKiemSoat, tenHang, ngaySanSuat, chuSoHuu);
        this.choNgoi = Integer.parseInt(choNgoi);
        this.kieuXe = kieuXe;
    }




    public String toString() {
        return super.toString() + "CHỖ NGỒI "+ choNgoi + " KIỂU XE" + kieuXe;
    }



}
