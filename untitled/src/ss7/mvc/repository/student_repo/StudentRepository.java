package ss7.mvc.repository.student_repo;

import ss7.mvc.model.Student;
import ss7.mvc.util.ReadAndWrite;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudenRepository {
    private final String STUDENT_FILE_NAME = "ss7/mvc/data/studen.csv";


    @Override
    public List<Student> findAll() {
        List<String> stringList = ReadAndWrite.readFileCSVToListString(STUDENT_FILE_NAME);
        List<Student> studentList = new ArrayList<>();
        for (String s : stringList) {
            String[] array = s.split(",");
            if (array.length == 5) {
                try {
                    LocalDate dateOfBirth = LocalDate.parse(array[2]);
                    Student student = new Student(array[0], dateOfBirth, array[2], array[3], array[4]);
                    studentList.add(student);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
        return studentList;
    }

    @Override
    public void add(Student student) {
        List<String> string = new ArrayList<>();
        string.add(student.toCSVRow());
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME,string);

    }

    @Override
    public boolean exists(int id) {
        List<Student> list=findAll();
        for (Student student : list) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Student student) {
        List<Student> list=findAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == student.getId()) {
                list.set(i, student);
            }
        }
        List<String> string = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            string.add(list.get(i).toCSVRow());
        }

        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME,string);

    }

    @Override
    public void delete(int id) {
        List<Student> list=findAll();
        list.removeIf(student -> student.getId() == id);
        List<String> string = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            string.add(list.get(i).toCSVRow());
        }
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME,string);
    }

    @Override
    public Student findById(int id) {
        List<Student> list=findAll();
        for (int i = 0; i <list.size() ; i++) {
            if (list.get(i).getId() == id) {
                return list.get(i);
            }
        }
        return null;
    }
}
