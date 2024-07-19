package ss7.mvc.model;

import java.time.LocalDate;

public class Student extends Person {
    private String className;

    public Student(String name, LocalDate dateOfBirth, String email, String phoneNumber, String className) {
        super(name, dateOfBirth, email, phoneNumber);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public void say() {
        System.out.println("I am a student");
    }

    @Override
    public String toString() {
        return "Student{" +
                "className='" + className + '\'' +
                '}' + super.toString();
    }
}
