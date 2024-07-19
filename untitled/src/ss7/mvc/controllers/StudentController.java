package ss7.mvc.controllers;

import ss7.mvc.model.Student;
import ss7.mvc.sevirce.student_sevirce.IStudentSevrice;
import ss7.mvc.sevirce.student_sevirce.StudentSevirce;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

public class StudentController {
    private static IStudentSevrice iStudentSevrice = new StudentSevirce();
    private static Scanner scanner = new Scanner(System.in);

    public static void displayStudent() {
        int choice;
        do {
            System.out.println("QUẢN LÝ HỌC VIÊN\n" +
                    "1. hiển thị học viên\n" +
                    "2. thêm mới học viên\n" +
                    "3. chỉnh sửa thông tin\n" +
                    "4. xoá học viên\n" +
                    "5. trở về trang chủ\n" +
                    "nhập lựa chọn của bạn:");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    displayStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ, vui lòng chọn lại.");
            }
        } while (true);
    }

    public static void displayStudents() {
        List<Student> students = iStudentSevrice.findAll();
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public static void addStudent() {
        System.out.println("Nhập tên học sinh:");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày tháng năm sinh học viên (định dạng: yyyy-MM-dd):");
        LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Nhập email học viên:");
        String email = scanner.nextLine();
        System.out.println("Nhập số điện thoại học viên:");
        String phoneNumber = scanner.nextLine();
        System.out.println("Nhập lớp của học viên:");
        String className = scanner.nextLine();

        Student student = new Student(name, dateOfBirth, email, phoneNumber, className);
        iStudentSevrice.add(student);

        System.out.println("Thêm học viên thành công.");
    }
}
