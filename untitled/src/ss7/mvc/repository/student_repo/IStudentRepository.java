package ss7.mvc.repository.student_repo;

import ss7.mvc.model.Student;
import java.util.List;

public interface IStudentRepository {
    List<Student> findAll();
    void add(Student student);
}