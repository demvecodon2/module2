package ss7.mvc.model;


import java.time.LocalDate;

public class Tecaher extends Person{
    private String level;
    public Tecaher(String name, LocalDate dateOfBirth, String email,String phoneNumber, String level) {
        super(name, dateOfBirth, email, phoneNumber);
        this.level = level;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
    @Override
    public  void say() {
        System.out.println(" chào các bạn học viên ");
    }

    @Override
    public String toString() {
        return "Tecaher{" +
                "level='" + level + '\'' +
                '}'+ super.toString();
    }
}
