package case_study_module2.model;

public class NguoiTieuDung {
    private String tenNguoiTieuDung;
    private String diaChiNguoiTieuDung;
    private String soDienThoai;
    private String gmail;

    public NguoiTieuDung(String tenNguoiTieuDung, String diaChiNguoiTieuDung, String soDienThoai, String gmail) {
        this.tenNguoiTieuDung = tenNguoiTieuDung;
        this.diaChiNguoiTieuDung = diaChiNguoiTieuDung;
        this.soDienThoai = soDienThoai;
        this.gmail = gmail;
    }
    public static NguoiTieuDung fromCSVString(String line) {
        String[] fields = line.split(",");
        if (fields.length != 4) {
            throw new IllegalArgumentException("Invalid CSV format for NguoiTieuDung");
        }
        String tenNguoiTieuDung = fields[0];
        String diaChiNguoiTieuDung = fields[1];
        String soDienThoai = fields[2];
        String gmail = fields[3];
        return new NguoiTieuDung(tenNguoiTieuDung, diaChiNguoiTieuDung, soDienThoai, gmail);
    }



    public String getTenNguoiTieuDung() {
        return tenNguoiTieuDung;
    }

    public void setTenNguoiTieuDung(String tenNguoiTieuDung) {
        this.tenNguoiTieuDung = tenNguoiTieuDung;
    }

    public String getDiaChiNguoiTieuDung() {
        return diaChiNguoiTieuDung;
    }

    public void setDiaChiNguoiTieuDung(String diaChiNguoiTieuDung) {
        this.diaChiNguoiTieuDung = diaChiNguoiTieuDung;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    @Override
    public String toString() {
        return "NguoiTieuDung{" +
                "tenNguoiTieuDung='" + tenNguoiTieuDung + '\'' +
                ", diaChiNguoiTieuDung='" + diaChiNguoiTieuDung + '\'' +
                ", soDienThoai='" + soDienThoai + '\'' +
                ", gmail='" + gmail + '\'' +
                '}';
    }
    public String toCSVString() {
        return tenNguoiTieuDung + "," + diaChiNguoiTieuDung + "," + soDienThoai + "," + gmail;
    }
}
