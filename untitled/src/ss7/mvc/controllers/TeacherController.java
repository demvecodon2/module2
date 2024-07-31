package ss7.mvc.controllers;

import ss7.mvc.model.Teacher;
import ss7.mvc.repository.teacher_repo.TeacherRepository;
import ss7.mvc.sevirce.teach_sevirce.teacher_service.ITeacherService;
import ss7.mvc.sevirce.teach_sevirce.teacher_service.TeacherService;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class TeacherController {
    private static final ITeacherService teacherService = new TeacherService(new TeacherRepository());
    private static final Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        int choice;
        do {
            System.out.println("QUẢN LÝ GIÁO VIÊN\n" +
                    "1. Hiển thị danh sách giảng viên\n" +
                    "2. Thêm mới giảng viên\n" +
                    "3. Chỉnh sửa thông tin giảng viên\n" +
                    "4. Xóa giảng viên\n" +
                    "5. Tìm kiếm giảng viên\n" +
                    "6. Quay lại trang chủ\n" +
                    "Nhập lựa chọn:");

            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        displayTeachers();
                        break;
                    case 2:
                        addTeacher();
                        break;
                    case 3:
                        editTeacher();
                        break;
                    case 4:
                        deleteTeacher();
                        break;
                    case 5:
                        searchTeacher();
                        break;
                    case 6:
                        System.out.println("Quay lại trang chủ...");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Lỗi nhập liệu: Vui lòng nhập một số nguyên.");
            }
        } while (true);
    }

    private static void displayTeachers() {
        System.out.println("Danh sách giảng viên:");
        List<Teacher> teachers = teacherService.findAll();
        if (teachers.isEmpty()) {
            System.out.println("Danh sách giảng viên trống.");
        } else {
            teachers.forEach(System.out::println);
        }
    }

    private static void addTeacher() {
        try {
            System.out.println("Nhập ID:");
            int id = Integer.parseInt(scanner.nextLine());
            if (teacherService.exists(id)) {
                System.out.println("ID đã tồn tại.");
                return;
            }
            System.out.println("Nhập tên giảng viên:");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày tháng năm sinh của giảng viên (yyyy-MM-dd):");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
            System.out.println("Nhập Email giảng viên:");
            String email = scanner.nextLine();
            System.out.println("Nhập số điện thoại của giảng viên:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Nhập lớp dạy:");
            String className = scanner.nextLine();
            Teacher teacher = new Teacher(id, name, dateOfBirth, email, phoneNumber, className);
            teacherService.add(teacher);
            System.out.println("Đã thêm giảng viên.");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi nhập liệu: ID phải là số nguyên.");
        } catch (DateTimeParseException e) {
            System.out.println("Lỗi định dạng ngày tháng năm sinh. Vui lòng nhập đúng định dạng (yyyy-MM-dd).");
        }
    }

    private static void editTeacher() {
        try {
            System.out.println("Nhập ID giảng viên cần chỉnh sửa:");
            int id = Integer.parseInt(scanner.nextLine());
            if (!teacherService.exists(id)) {
                System.out.println("ID không tồn tại.");
                return;
            }

            System.out.println("Nhập tên giảng viên mới:");
            String name = scanner.nextLine();
            System.out.println("Nhập ngày tháng năm sinh mới của giảng viên (yyyy-MM-dd):");
            LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
            System.out.println("Nhập Email mới của giảng viên:");
            String email = scanner.nextLine();
            System.out.println("Nhập số điện thoại mới của giảng viên:");
            String phoneNumber = scanner.nextLine();
            System.out.println("Nhập lớp dạy mới:");
            String className = scanner.nextLine();

            Teacher teacher = new Teacher(id, name, dateOfBirth, email, phoneNumber, className);
            teacherService.edit(teacher);
            System.out.println("Đã chỉnh sửa giảng viên.");
        } catch (NumberFormatException e) {
            System.out.println("Lỗi nhập liệu: ID phải là số nguyên.");
        } catch (DateTimeParseException e) {
            System.out.println("Lỗi định dạng ngày tháng năm sinh. Vui lòng nhập đúng định dạng (yyyy-MM-dd).");
        }
    }

    private static void deleteTeacher() {
        try {
            System.out.println("Nhập ID giảng viên cần xóa:");
            int id = Integer.parseInt(scanner.nextLine());
            if (!teacherService.exists(id)) {
                System.out.println("ID không tồn tại.");
                return;
            }
            teacherService.delete(id);
            System.out.println("Đã xóa giảng viên.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void searchTeacher() {
        System.out.println("Chọn tiêu chí tìm kiếm:");
        System.out.println("1. Tìm theo ID");
        System.out.println("2. Tìm theo tên");
        System.out.println("3. Tìm theo email");
        System.out.print("Nhập lựa chọn của bạn: ");

        int criterion = Integer.parseInt(scanner.nextLine());

        switch (criterion) {
            case 1:
                searchById();
                break;
            case 2:
                searchByName();
                break;
            case 3:
                searchByEmail();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    }

    private static void searchById() {
        try {
            System.out.println("Nhập ID giảng viên cần tìm:");
            int id = Integer.parseInt(scanner.nextLine());
            Teacher teacher = teacherService.findById(id);
            if (teacher == null) {
                System.out.println("Không tìm thấy giảng viên với ID: " + id);
            } else {
                System.out.println("Kết quả tìm kiếm:");
                System.out.println(teacher);
            }
        } catch (NumberFormatException e) {
            System.out.println("Lỗi nhập liệu: ID phải là số nguyên.");
        }
    }

    private static void searchByName() {
        System.out.println("Nhập từ khoá tìm kiếm (tên):");
        String keyword = scanner.nextLine().toLowerCase();

        List<Teacher> teachers = teacherService.findAll();
        List<Teacher> result = teachers.stream()
                .filter(t -> t.getName().toLowerCase().contains(keyword))
                .toList();

        if (result.isEmpty()) {
            System.out.println("Không tìm thấy giảng viên nào với tên chứa: " + keyword);
        } else {
            System.out.println("Kết quả tìm kiếm:");
            result.forEach(System.out::println);
        }
    }

    private static void searchByEmail() {
        System.out.println("Nhập từ khoá tìm kiếm (email):");
        String keyword = scanner.nextLine().toLowerCase();

        List<Teacher> teachers = teacherService.findAll();
        List<Teacher> result = teachers.stream()
                .filter(t -> t.getEmail().toLowerCase().contains(keyword))
                .toList();

        if (result.isEmpty()) {
            System.out.println("Không tìm thấy giảng viên nào với email chứa: " + keyword);
        } else {
            System.out.println("Kết quả tìm kiếm:");
            result.forEach(System.out::println);
        }
    }

    public static void displayTeacher() {
        displayMenu();
    }
}
