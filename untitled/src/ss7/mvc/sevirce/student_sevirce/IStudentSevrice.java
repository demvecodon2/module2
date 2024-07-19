package ss7.mvc.sevirce.student_sevirce;

import ss7.mvc.model.Student;
import java.util.List;

public interface IStudentSevrice {
    List<Student> findAll();
    void add(Student student);
}
