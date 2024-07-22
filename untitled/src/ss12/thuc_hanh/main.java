package ss12.thuc_hanh;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class main {
    public static void main(String[] args) {
        Student student1 = new Student( "HIEU",20,"QT");
        Student student2 = new Student( "NGUYEN",21,"QN");
        Map<Integer,Student> map = new HashMap<Integer, Student>();
        map.put(1,student1);
        map.put(2,student2);
        map.put(3,student1);
        for(Map.Entry<Integer,Student> student : map.entrySet()){
            System.out.println(student.toString());
        }
        System.out.println("....set");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student1);
        for(Student student : students){
            System.out.println(student.toString());
        }
    }
}
