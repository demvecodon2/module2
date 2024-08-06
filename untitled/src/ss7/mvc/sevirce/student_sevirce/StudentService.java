package ss7.mvc.sevirce.student_sevirce;

import ss7.mvc.model.Student;
import ss7.mvc.util.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private static final String STUDENT_FILE_NAME = "src/ss7/mvc/data/studen.csv";

    @Override
    public List<Student> findAll() {
       List<String> student= ReadAndWrite.readFileCSVToListString(STUDENT_FILE_NAME);
       List<Student> students= new ArrayList<>();
       if (student!=null) {
           for (String s : student) {
               String[] arr = s.split(",");
               Student student1= new Student(Integer.parseInt(arr[0]),arr[1],LocalDate.parse(arr[2]),arr[3],arr[4],arr[5] );
               students.add(student1);


           }
       }return students;
    }
    @Override
    public void add(Student student) {
      List<Student>studentList= findAll();
      studentList.add(student);
      List<String> stringList= new ArrayList<>();
      for (Student s : studentList) {
          stringList.add(s.getName());
      }
      ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME, stringList, true);

    }

    @Override
    public void update(Student updatedStudent) {
        List<Student> students = findAll();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == updatedStudent.getId()) {
                students.set(i, updatedStudent);
                saveAll(students);
                return;
            }
        }
        System.out.println("Học viên với ID " + updatedStudent.getId() + " không tồn tại.");
    }

    @Override
    public boolean delete(int id) {
        List<Student> students = findAll();
        students.removeIf(student -> student.getId() == id);
        List<String> studentList = new ArrayList<>();
        for (Student student : students) {
            studentList.add(student.toCSVRow());
        }
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME, studentList, true);
        return false;
    }

    @Override
    public Student findById(int id) {
        List<Student> students = findAll();
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public int getNextId() {
        List<Student> students = findAll();
        return students.stream()
                .mapToInt(Student::getId)
                .max()
                .orElse(0) + 1;
    }

    private void saveAll(List<Student> students) {
        List<String> stringList = new ArrayList<>();
        for (Student student : students) {
            stringList.add(student.toCsvString());
        }
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME + "_" + getNextId(), stringList, true);
    }
}
