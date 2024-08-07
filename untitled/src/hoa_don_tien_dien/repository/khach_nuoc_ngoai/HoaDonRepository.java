package hoa_don_tien_dien.repository.khach_nuoc_ngoai;

import hoa_don_tien_dien.model.HoaDon;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HoaDonRepository {
    private static final String HOADON_FILE = "src/hoa_don_tien_dien/data/HoaDon.csv";

    public void addHoaDon(HoaDon hoaDon) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(HOADON_FILE, true))) {
            bw.write(hoaDon.toString());
            bw.newLine();
        }
    }
    public List<HoaDon> getAllHoaDon() throws IOException {
        List<HoaDon> hoaDonList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(HOADON_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String maHoaDon = parts[0];
                String maKhachHang = parts[1];
                String ngayRaHoaDonStr = parts[2];
                LocalDate ngayRaHoaDon = LocalDate.parse(ngayRaHoaDonStr);
                int soLuong = Integer.parseInt(parts[3]);
                double donGia = Double.parseDouble(parts[4]);
                HoaDon hoaDon = new HoaDon(maHoaDon, maKhachHang, ngayRaHoaDon, (double) soLuong, (int) donGia);
                hoaDonList.add(hoaDon);
            }
        }
        return hoaDonList;
    }

}
