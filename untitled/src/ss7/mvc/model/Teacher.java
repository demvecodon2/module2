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
        // Chuyển đổi thông tin của teacher thành chuỗi để hiển thị
        return "Teacher{" +
                "id=" + id +
                ", name='" + getName() + '\'' + // Sử dụng getName() từ lớp cha Person
                ", dateOfBirth=" + getDateOfBirth() + // Sử dụng getDateOfBirth() từ lớp cha Person
                ", email='" + getEmail() + '\'' + // Sử dụng getEmail() từ lớp cha Person
                ", phoneNumber='" + getPhoneNumber() + '\'' + // Sử dụng getPhoneNumber() từ lớp cha Person
                ", className='" + className + '\'' +
                '}';
    }

    public String toCsvString() {
        // Chuyển đổi thông tin của teacher thành chuỗi CSV
        int dateOfBirth = 0;
        return id + "," +
                "\"" + getName() + "\"," + // Bao quanh tên bằng dấu ngoặc kép để xử lý các dấu phẩy
                dateOfBirth + "," +
                "\"" + getEmail() + "\"," +
                "\"" + getPhoneNumber() + "\"," +
                "\"" + className + "\"";
    }
}
