package ss7.mvc.repository.student_repo;

import ss7.mvc.model.Student;
import ss7.mvc.model.Teacher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class StudentRepository implements IStudenRepository {
    private static List<Teacher> list = new LinkedList<Teacher>();
    private static int teacherId = 1;

    static {
        Teacher s1 = new Teacher(teacherId++, "Hieu", LocalDate.parse("2001-10-03"), "hieudh@gmail.com", "017256457", "c032");
        Teacher s2 = new Teacher(teacherId++, "Hiseu", LocalDate.parse("1999-10-03"), "hiedudh@gmail.com", "017256457", "c032");
        list.add(s1);
        list.add(s2);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(teacherId);
    }

    @Override
    public void add(Student student) {

    }

    @Override
    public boolean exists(String id) {
        return false;
    }

    @Override
    public boolean exists(int id) {
        return false;
    }

    @Override
    public void update(Student student) {

    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
