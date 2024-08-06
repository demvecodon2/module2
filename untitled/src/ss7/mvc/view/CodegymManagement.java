package ss7.mvc.view;

import ss7.mvc.controllers.StudentController;
import ss7.mvc.controllers.TeacherController;

import java.util.Scanner;

public class CodegymManagement {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            int choice;
            do {
                    displayMenu();
                choice = getIntInput();

                switch (choice) {
                    case 1:
                        StudentController.displayStudent();
                        break;
                    case 2:
                        TeacherController.displayTeacher();
                        break;
                    case 3:
                        System.out.println("Thoát chương trình.");
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                }
            } while (true);
        } finally {
            sc.close();
        }
    }

    private static void displayMenu() {
        System.out.println("Quản lý CodeGym:\n" +
                "1. Quản lý học viên\n" +
                "2. Quản lý giảng viên\n" +
                "3. Thoát chương trình\n" +
                "Nhập lựa chọn của bạn:");
    }

    private static int getIntInput() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Nhập không hợp lệ. Vui lòng nhập số.");
            }
        }
    }
}
