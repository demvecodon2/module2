package ss12.thuc_hanh.bai1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Student student = new Student("hiếu", 30,"csf");
        Student student1 = new Student("hiếu", 31,"csf");
        Student student2 = new Student("hi2ếu", 32,"csf");
        List<Student> lists = new ArrayList<Student>();
       lists.add(student);
       lists.add(student1);
       lists.add(student2);
        Collections.sort(lists);
        for (Student s : lists) {
            System.out.println(s.toString());
        }
        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(lists, ageComparator);
        System.out.println("so sánh ");
        for (Student s : lists) {
            System.out.println(s.toString());
        }


    }
    }

