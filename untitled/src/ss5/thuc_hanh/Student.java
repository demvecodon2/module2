package ss5.thuc_hanh;

public class Student {
    private String name;
    private int age;
    private static String college = "BBFASD";
    Student(String n, int r) {
        name = n;
        age = r;
    }
    static void change() {
        college = "CodeGym";
    }
    void display() {
        System.out.println(college + "" + name + "" + age);
    }

}
