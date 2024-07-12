package ss5.thuc_hanh;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
      Student.change(); //calling change method

        //creating objects
        Student s1 = new Student("HIẾU", 18);
        Student s2 = new Student("HIẾU", 19);
        Student s3 = new Student("HIẾU", 20);


        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }}
