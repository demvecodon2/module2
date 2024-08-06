package hoa_don_tien_dien.controllers;

import hoa_don_tien_dien.model.HoaDon;

import hoa_don_tien_dien.model.HoaDonVN;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class HoaDonController {

    private static final String HOADON_FILE = "src/hoa_don_tien_dien/data/HoaDon.csv";
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    private void addHoaDonToFile(HoaDon hoaDon) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(HOADON_FILE, true))) {
            bw.write(hoaDon.toString());
            bw.newLine();
        }
    }

    public void themHoaDon() throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập mã hóa đơn:");
        String maHoaDon = scanner.nextLine();

        System.out.println("Nhập mã khách hàng:");
        String maKhachHang = scanner.nextLine();

        System.out.println("Nhập ngày ra hóa đơn (định dạng yyyy-MM-dd):");
        String ngayRaHoaDonStr = scanner.nextLine();
        LocalDate ngayRaHoaDon;
        try {
            ngayRaHoaDon = LocalDate.parse(ngayRaHoaDonStr, DATE_FORMATTER);
        } catch (Exception e) {
            System.out.println("Định dạng ngày tháng không hợp lệ. Vui lòng sử dụng định dạng yyyy-MM-dd.");
            return;
        }

        System.out.println("Nhập số lượng (số KW tiêu thụ):");
        int soLuong = scanner.nextInt();

        System.out.println("Nhập đơn giá:");
        int donGia = scanner.nextInt();
        scanner.nextLine(); // Clear buffer

        HoaDon hoaDon;
        System.out.println("Chọn loại khách hàng:");
        System.out.println("1. Khách hàng Việt Nam");
        System.out.println("2. Khách hàng nước ngoài");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) {
            hoaDon = new HoaDonVN(maHoaDon, maKhachHang, ngayRaHoaDon, soLuong, donGia);
        } else {
            hoaDon = new HoaDonVN(maHoaDon, maKhachHang, ngayRaHoaDon, soLuong, donGia);
        }

        addHoaDonToFile(hoaDon);
        System.out.println("Hóa đơn đã được thêm vào thành công.");
    }

    public void chinhSuaHoaDon(String maHoaDon) throws IOException {
        File inputFile = new File(HOADON_FILE);
        File tempFile = new File("src/hoa_don_tien_dien/data/HoaDon_temp.csv");

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile))) {

            String line;
            boolean updated = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith(maHoaDon + ",")) {
                    System.out.println("Nhập thông tin mới cho hóa đơn:");

                    Scanner scanner = new Scanner(System.in);
                    System.out.println("Nhập mã hóa đơn mới:");
                    String newMaHoaDon = scanner.nextLine();
                    System.out.println("Nhập mã khách hàng mới:");
                    String newMaKhachHang = scanner.nextLine();
                    System.out.println("Nhập ngày ra hóa đơn mới (định dạng yyyy-MM-dd):");
                    String newNgayRaHoaDonStr = scanner.nextLine();
                    LocalDate newNgayRaHoaDon = LocalDate.parse(newNgayRaHoaDonStr, DATE_FORMATTER);
                    System.out.println("Nhập số lượng mới:");
                    int newSoLuong = scanner.nextInt();
                    System.out.println("Nhập đơn giá mới:");
                    int newDonGia = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer

                    String updatedLine = String.format("%s,%s,%s,%d,%d",
                            newMaHoaDon, newMaKhachHang, newNgayRaHoaDon, newSoLuong, newDonGia);
                    writer.write(updatedLine);
                    writer.newLine();
                    updated = true;
                } else {
                    writer.write(line);
                    writer.newLine();
                }
            }

            if (!updated) {
                System.out.println("Không tìm thấy hóa đơn với mã: " + maHoaDon);
            }
        }

        if (!inputFile.delete()) {
            System.out.println("Không thể xóa file cũ.");
            return;
        }
        if (!tempFile.renameTo(inputFile)) {
            System.out.println("Không thể đổi tên file tạm thời.");
        }
    }

    public void hienThiChiTietHoaDon(String maHoaDon) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(HOADON_FILE))) {
            String line;
            boolean found = false;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(maHoaDon + ",")) {
                    System.out.println(line);
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println("Không tìm thấy hóa đơn với mã: " + maHoaDon);
            }
        }
    }
}
