package ss7.mvc.repository.student_repo;

import ss7.mvc.model.Student;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class StudentRepository implements IStudenRepository {
    private static List<Student> list = new ArrayList<>();
    private static int currentId = 1;

    static {

        Student s1 = new Student(currentId++, "Hiếu", LocalDate.parse("2001-01-08"), "hoangngochieuv@gmail.com", "01271245716", "C05");
        Student s2 = new Student(currentId++, "Hiếu", LocalDate.parse("2001-01-07"), "hoangngochieuv@gmail.com", "01271245716", "C05");
        list.add(s1);
        list.add(s2);
    }

    @Override
    public List<Student> findAll() {
        return new ArrayList<>(list);
    }

    @Override
    public void add(Student student) {
        student.setId(currentId++);
        list.add(student);
    }

    @Override
    public boolean exists(String id) {
        return false;
    }

    @Override
    public boolean exists(int id) {
        return list.stream().anyMatch(student -> student.getId() == id);
    }

    @Override
    public void update(Student student) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == student.getId()) {
                list.set(i, student);
                return;
            }
        }
        System.out.println("Student with ID " + student.getId() + " not found.");
    }

    @Override
    public void delete(int id) {
        list.removeIf(student -> student.getId() == id);
    }

    @Override
    public Student findById(int id) {
        return null;
    }
}
