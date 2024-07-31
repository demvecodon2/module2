package ss7.mvc.model;

import java.time.LocalDate;

public class Teacher extends Person {
    private int id;
    private String className;

    public Teacher(int id, String name, LocalDate dateOfBirth, String email, String phoneNumber, String className) {
        super(name, dateOfBirth, email, phoneNumber);
        this.id = id;
        this.className = className;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public void say() {
        System.out.println("I am a teacher");
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + getName() + '\'' +
                ", dateOfBirth=" + getDateOfBirth() +
                ", email='" + getEmail() + '\'' +
                ", phoneNumber='" + getPhoneNumber() + '\'' +
                ", className='" + className + '\'' +
                '}';
    }
@Override
 public String toCsvString() {

            return String.join(",",
                    String.valueOf(getId()),
                    getName(),
                    getDateOfBirth().toString(),
                    getEmail(),
                    getPhoneNumber(),
                    getClassName()
            );

    }
}
