package ss7.mvc.repository.student_repo;

import ss7.mvc.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudentRepository {
    private final static List<Student> list;

    static {
        list = new ArrayList<>();
        Student s1 = new Student("Hiếu", LocalDate.parse("2001-01-08"), "hoangngochieuv@gmail.com", "01271245716", "C05");
        Student s2 = new Student("Hiếu", LocalDate.parse("2001-01-07"), "hoangngochieuv@gmail.com", "01271245716", "C05");

        list.add(s1);
        list.add(s2);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(list); // Return a copy of the list to prevent modification
    }

    @Override
    public void add(Student student) {
        list.add(student);
    }
}
