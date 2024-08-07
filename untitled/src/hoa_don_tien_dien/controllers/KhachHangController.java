package hoa_don_tien_dien.controllers;

import hoa_don_tien_dien.model.KhachHang;
import hoa_don_tien_dien.model.KhachHangNuocNgoai;
import hoa_don_tien_dien.model.KhachHangVietNam;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class KhachHangController {
    private static final String KHACH_HANG_FILE = "src/hoa_don_tien_dien/data/KhachHang.csv";
    private static final String LOAI_KHACH_FILE = "src/hoa_don_tien_dien/data/LoaiKhach.csv";

    private static List<String> readLoaiKhach() throws IOException {
        List<String> loaiKhachs = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(LOAI_KHACH_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                loaiKhachs.add(line);
            }
        }
        return loaiKhachs;
    }

    private static boolean kiemTraMaKhachHang(String maKhach, boolean isVietnamese) {
        String regex = isVietnamese ? "KHVN-\\d{5}" : "KHNN-\\d{5}";
        return Pattern.matches(regex, maKhach);
    }

    private static boolean trungLapMaKhachHang(String maKhach) throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(KHACH_HANG_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts[0].equals(maKhach)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static void addKhachHangToFile(String khachHang) throws IOException {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(KHACH_HANG_FILE, true))) {
            bw.write(khachHang);
            bw.newLine();
        }
    }

    public void hienThiKhachHang() throws IOException {
        try (BufferedReader br = new BufferedReader(new FileReader(KHACH_HANG_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                if (array.length >= 3) {
                    String maKhach = array[0];
                    String tenKhach = array[1];
                    String loaiKhach = array[2];
                    if (array.length >= 4) {
                        int mucTieuThu = Integer.parseInt(array[3]);
                        KhachHangVietNam khachViet = new KhachHangVietNam(maKhach, tenKhach, mucTieuThu, loaiKhach);
                        System.out.println(khachViet);
                    } else if (array.length == 3) {
                        KhachHangNuocNgoai khachNuocNgoai = new KhachHangNuocNgoai(maKhach, tenKhach, loaiKhach);
                        System.out.println(khachNuocNgoai);
                    }
                }
            }
        }
    }

    public void themKhachHang() throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại khách hàng:");
        System.out.println("1. Thêm khách hàng Việt Nam");
        System.out.println("2. Thêm khách hàng nước ngoài");
        int choice = scanner.nextInt();
        scanner.nextLine();

        boolean isVietnamese = choice == 1;

        System.out.println("Nhập mã khách hàng:");
        String maKhach = scanner.nextLine();

        if (!kiemTraMaKhachHang(maKhach, isVietnamese)) {
            System.out.println("Mã khách hàng không hợp lệ!");
            return;
        }

        if (trungLapMaKhachHang(maKhach)) {
            System.out.println("Mã khách hàng đã tồn tại!");
            return;
        }

        System.out.println("Nhập họ tên khách hàng:");
        String tenKhachHang = scanner.nextLine();

        if (isVietnamese) {
            List<String> loaiKhachList = readLoaiKhach();
            System.out.println("Nhập loại khách hàng (có trong file loaiKhach.csv):");
            String loaiKhachHang = scanner.nextLine();

            if (!loaiKhachList.contains(loaiKhachHang)) {
                System.out.println("Loại khách hàng không hợp lệ!");
                return;
            }

            System.out.println("Nhập mức tiêu thụ:");
            int mucTieuThu = scanner.nextInt();

            KhachHangVietNam khachViet = new KhachHangVietNam(maKhach, tenKhachHang, loaiKhachHang, mucTieuThu);
            addKhachHangToFile(khachViet.toString());
        } else {
            System.out.println("Nhập quốc tịch:");
            String quocTich = scanner.nextLine();

            KhachHangNuocNgoai khachNuocNgoai = new KhachHangNuocNgoai(maKhach, tenKhachHang, quocTich);
            addKhachHangToFile(khachNuocNgoai.toString());
        }

        System.out.println("Khách hàng đã được thêm vào thành công!");
    }

    public void timKiemKhachHang(String tenKhachHangCanTim) throws IOException {
        List<KhachHang> danhSachKhachHang = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(KHACH_HANG_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] array = line.split(",");
                if (array.length >= 3) {
                    String maKhachHang = array[0];
                    String ten = array[1];
                    String loaiKhach = array[2];

                    if (ten.toLowerCase().contains(tenKhachHangCanTim.toLowerCase())) {
                        if (array.length == 4) {
                            int mucTieuThu = Integer.parseInt(array[3]);
                            danhSachKhachHang.add(new KhachHangVietNam(maKhachHang, ten, mucTieuThu, loaiKhach));
                        } else if (array.length == 3) {
                            danhSachKhachHang.add(new KhachHangNuocNgoai(maKhachHang, ten, loaiKhach));
                        }
                    }
                }
            }
        }
        if (danhSachKhachHang.isEmpty()) {
            System.out.println("Không có khách hàng nào được tìm thấy với tên: " + tenKhachHangCanTim);
        } else {
            System.out.println("Danh sách khách hàng tìm được:");
            for (KhachHang khachHang : danhSachKhachHang) {
                System.out.println(khachHang);
            }
        }
    }
}
