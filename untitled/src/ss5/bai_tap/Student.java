package ss5.bai_tap;

import java.time.LocalDate;

public class Student {
    private String name;
    private String classe;
    public  Student(String hiếu, LocalDate parse, String mail, String number, String c05){};
    void setName(String name){
        this.name = name;
    }
    protected  void setClasse(String classe){
        this.classe = classe;
    }
    @Override
    public String toString(){
        return "Student [name=" + name + ", classe=" + classe + "]";
    }
}
