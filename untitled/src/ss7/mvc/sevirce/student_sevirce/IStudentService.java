package ss7.mvc.sevirce.student_sevirce;

import ss7.mvc.model.Student;
import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    Student findById(int id);
    void add(Student student);
    void update(Student student);
    boolean delete(int id);
    int getNextId();
}