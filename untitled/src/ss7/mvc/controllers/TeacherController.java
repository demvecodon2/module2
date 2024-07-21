package ss7.mvc.controllers;

import ss7.mvc.model.Teacher;
import ss7.mvc.service.teacher_service.ITeacherService;
import ss7.mvc.repository.teacher_repo.TeacherRepository;
import ss7.mvc.sevirce.teach_sevirce.TeacherService;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

public class TeacherController {
    private static ITeacherService teacherService = new TeacherService(new TeacherRepository());
    private static Scanner scanner = new Scanner(System.in);

    public static void displayMenu() {
        int choice;
        do {
            System.out.println("QUẢN LÝ GIÁO VIÊN\n" +
                    "1. Hiển thị danh sách giảng viên\n" +
                    "2. Thêm mới giảng viên\n" +
                    "3. Chỉnh sửa thông tin giảng viên\n" +
                    "4. Xóa giảng viên\n" +
                    "5. Quay lại trang chủ\n" +
                    "Nhập lựa chọn:");

            choice = getIntInput();
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
                    System.out.println("Quay lại trang chủ...");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng nhập lại.");
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
        System.out.println("Nhập ID:");
        int id = getIntInput();
        if (teacherService.exists(id)) {
            System.out.println("ID đã tồn tại.");
            return;
        }
        System.out.println("Nhập tên giảng viên:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh của giảng viên (yyyy-MM-dd):");
        LocalDate dateOfBirth = getDateInput();
        System.out.println("Nhập Email giảng viên:");
        String email = scanner.nextLine();
        System.out.println("Nhập số điện thoại của giảng viên:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập lớp dạy:");
        String className = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, email, phoneNumber, className);
        teacherService.add(teacher);
        System.out.println("Đã thêm giảng viên.");
    }

    private static void editTeacher() {
        System.out.println("Nhập ID giảng viên cần chỉnh sửa:");
        int id = getIntInput();
        if (!teacherService.exists(id)) {
            System.out.println("ID không tồn tại.");
            return;
        }

        System.out.println("Nhập tên giảng viên mới:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh mới của giảng viên (yyyy-MM-dd):");
        LocalDate dateOfBirth = getDateInput();
        System.out.println("Nhập Email mới của giảng viên:");
        String email = scanner.nextLine();
        System.out.println("Nhập số điện thoại mới của giảng viên:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập lớp dạy mới:");
        String className = scanner.nextLine();

        Teacher teacher = new Teacher(id, name, dateOfBirth, email, phoneNumber, className);
        teacherService.edit(teacher);
        System.out.println("Đã chỉnh sửa giảng viên.");
    }

    private static void deleteTeacher() {
        System.out.println("Nhập ID giảng viên cần xóa:");
        int id = getIntInput();
        if (!teacherService.exists(id)) {
            System.out.println("ID không tồn tại.");
            return;
        }
        teacherService.delete(id);
        System.out.println("Đã xóa giảng viên.");
    }

    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không hợp lệ. Vui lòng nhập số.");
            }
        }
    }

    private static LocalDate getDateInput() {
        while (true) {
            try {
                return LocalDate.parse(scanner.nextLine());
            } catch (DateTimeParseException e) {
                System.out.println("Ngày tháng năm không hợp lệ. Vui lòng nhập theo định dạng yyyy-MM-dd.");
            }
        }
    }

    public static void displayTeacher() {
        displayMenu();
    }
}
