package ss7.mvc.sevirce.student_sevirce;

import ss7.mvc.model.Student;
import java.util.List;

public interface IStudentService {
    List<Student> findAll();
    void add(Student student);
    void update(Student student);
    boolean delete(int id);
    Student findById(int id);
    int getNextId();
}

