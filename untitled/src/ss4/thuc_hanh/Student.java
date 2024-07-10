package ss4.thuc_hanh;

import java.time.LocalDate;

public class Student {
    public String name;
    public LocalDate date;
    public String email;

    public Student() {
   }
   public Student(String name, LocalDate date, String email) {
        this.name = name;
        this.date = date;
        this.email = email;
   }
    public void learn(String subject) {
        System.out.println("mon hoc " + subject);
    }
    public void getStudentInfo() {
        System.out.println("name" + this.name + "ngay sinh" + this.date + "email" + this.email);
    }
}
