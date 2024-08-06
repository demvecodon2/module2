package ss7.mvc.repository.student_repo;
import ss7.mvc.model.Student;
import ss7.mvc.util.ReadAndWrite;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudenRepository {
    private final String STUDENT_FILE_NAME = "ss7/mvc/data/studen.csv";

    @Override
    public List<Student> findAll() {
        List<String> students = ReadAndWrite.readFileCSVToListString(STUDENT_FILE_NAME);
        List<Student> studentList = new ArrayList<>();

        if (students != null) {
            for (String student : students) {
                String[] array = student.split(",");
                Student student1 = new Student(Integer.parseInt(array[0]), array[1], LocalDate.parse(array[2]), array[3], array[4], array[5]);
                studentList.add(student1);
            }
        }

        return studentList;
    }

    @Override
    public void add(Student student) {
        List<Student> studentList = findAll();
        studentList.add(student);
        List<String> stringList = new ArrayList<>();
        for (Student s : studentList) {
            stringList.add(s.toCSVRow());
        }
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME, stringList, true);
    }

    @Override
    public boolean exists(int id) {
        List<Student> list = findAll();
        for (Student student : list) {
            if (student.getId() == id) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void update(Student student) {
        List<Student> list = findAll();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == student.getId()) {
                list.set(i, student);
                break; // Assuming IDs are unique, we can exit early
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Student s : list) {
            stringList.add(s.toCSVRow());
        }
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME, stringList, true);
    }

    @Override
    public void delete(int id) {
        List<Student> list = findAll();
        list.removeIf(student -> student.getId() == id);
        List<String> stringList = new ArrayList<>();
        for (Student s : list) {
            stringList.add(s.toCSVRow());
        }
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME, stringList, true);
    }

    @Override
    public Student findById(int id) {
        List<Student> list = findAll();
        for (Student student : list) {
            if (student.getId() == id) {
                return student;
            }
        }
        return null; // Return null if not found
    }
}
