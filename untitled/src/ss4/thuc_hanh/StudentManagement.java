package ss4.thuc_hanh;

import java.time.LocalDate;

public class StudentManagement {
    public static void main(String[] args) {
        Student std = new Student();
        Student std1 = new Student("hiếu", LocalDate.parse("2001-01-07"),"hoangngochieuv@gmail.com");
        std.learn("it");
        std.getStudentInfo();
        std1.getStudentInfo();
    }
}
