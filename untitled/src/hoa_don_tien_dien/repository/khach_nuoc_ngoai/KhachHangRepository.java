package hoa_don_tien_dien.repository.khach_nuoc_ngoai;

import hoa_don_tien_dien.model.KhachHang;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class KhachHangRepository {
    private List<KhachHang> khachHangList;
    private String filePath = "changing.txt";

    public KhachHangRepository() {
        khachHangList = new ArrayList<>();
        loadKhachHangData();
    }

    private void loadKhachHangData() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                KhachHang khachHang = new KhachHang(data[0], data[1], data[2], Integer.parseInt(data[3]));
                khachHangList.add(khachHang);
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc dữ liệu khách hàng: " + e.getMessage());
        }
    }

    public void saveKhachHangData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (KhachHang khachHang : khachHangList) {
                writer.write(khachHang.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Lỗi khi lưu dữ liệu khách hàng: " + e.getMessage());
        }
    }

    public void addKhachHang(KhachHang khachHang) {
        khachHangList.add(khachHang);
        saveKhachHangData();
    }

    public List<KhachHang> getAllKhachHang() {
        return khachHangList;
    }

    public KhachHang findKhachHangByName(String tenKhachHang) {
        for (KhachHang khachHang : khachHangList) {
            if (khachHang.getTenKhachHang().equalsIgnoreCase(tenKhachHang)) {
                return khachHang;
            }
        }
        return null;
    }
}
