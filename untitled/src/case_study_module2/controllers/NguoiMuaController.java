    package case_study_module2.controllers;

    import case_study_module2.model.NguoiTieuDung;
    import case_study_module2.repository.nguoi_mua.INguoiMuaRepo;
    import case_study_module2.repository.nguoi_mua.NguoiMuaRepoImpl;
    import java.util.List;
    import java.util.Scanner;



    public class NguoiMuaController {
        private static final INguoiMuaRepo nguoiMuaRepo = new NguoiMuaRepoImpl();
        private static final Scanner scanner = new Scanner(System.in);
        public static void displayNguoiTieuDung() {
            int choice;
            do {
                System.out.println("1. Nhập thông tin người tiêu dùng");
                System.out.println("2. Hiển thị thông tin người tiêu dùng");
                System.out.println("3. Hiển thị khách hàng mua gì");
                System.out.println("4. Quay về trang chủ");
                choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1:
                        nhapThongTinNguoiTieuDung();
                        break;
                    case 2:
                        hienThiNguoiTieuDung();
                        break;
                    case 3:
                        hienThiDoKhachMua();
                        break;
                    case 4:
                        System.out.println("Quay lại trang chủ");
                        return;
                    default:
                        System.out.println("Lựa chọn của bạn không hợp lệ");
                }
            } while (true);
        }

        private static void nhapThongTinNguoiTieuDung() {
            System.out.print("Nhập tên người tiêu dùng: ");
            String tenNguoiTieuDung = scanner.nextLine();
            System.out.print("Nhập địa chỉ người tiêu dùng: ");
            String diaChiNguoiTieuDung = scanner.nextLine();
            System.out.print("Nhập Gmail người tiêu dùng: ");
            String gmailNguoiTieuDung = scanner.nextLine();
            System.out.print("Nhập số điện thoại người tiêu dùng: ");
            String soDienThoai = scanner.nextLine();

            NguoiTieuDung nguoiTieuDung = new NguoiTieuDung(tenNguoiTieuDung, diaChiNguoiTieuDung, soDienThoai, gmailNguoiTieuDung);
            nguoiMuaRepo.save(nguoiTieuDung);
            System.out.println("Thông tin người tiêu dùng đã được lưu.");
        }

        private static void hienThiNguoiTieuDung() {
            List<NguoiTieuDung> danhSachNguoiTieuDung = nguoiMuaRepo.findAll();
            if (danhSachNguoiTieuDung.isEmpty()) {
                System.out.println("Chưa có người tiêu dùng nào.");
            } else {
                System.out.println("Danh sách người tiêu dùng:");
                for (NguoiTieuDung nguoiTieuDung : danhSachNguoiTieuDung) {
                    System.out.println(nguoiTieuDung);
                }
            }
        }

        private static void hienThiDoKhachMua() {
            List<String> danhSachMua = nguoiMuaRepo.thongTin();
            if (danhSachMua.isEmpty()) {
                System.out.println("Không có thông tin mua hàng.");
            } else {
                System.out.println("Danh sách hàng đã mua:");
                for (String item : danhSachMua) {
                    System.out.println(item);
                }
            }
        }

    }

