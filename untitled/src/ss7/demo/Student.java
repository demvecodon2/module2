package ss7.demo;

public class Student extends Person{
    private String className;

    public Student() {
    }



    public Student(int id, String name, String className) {
        super(id, name);
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
    @Override
    public void howToGo() {
        System.out.println("di chuyển bằng xe máy");
    }
    @Override
    public String toString() {
        return "Student{" + super.toString()+
                "className='" + className + '\'' +
                '}';
    }
}
