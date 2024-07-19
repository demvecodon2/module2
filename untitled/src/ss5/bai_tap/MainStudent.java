package ss5.bai_tap;

import java.time.LocalDate;

public class MainStudent {
    public static void main(String[] args) {
        Student student = new Student("hiếu", LocalDate.parse("2001-01-07"), "hoangngochieuv@gmail.com", "01271245716", "c05");
        student.setName("hiếu");
        student.setClasse("c05");
        System.out.println(student);
        
    }
}
