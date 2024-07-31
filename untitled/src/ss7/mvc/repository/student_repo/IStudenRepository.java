package ss7.mvc.repository.student_repo;

import ss7.mvc.model.Student;

import java.util.List;

public interface IStudenRepository {
    List<Student> findAll();

    void add(Student student);

    boolean exists(int id);

    void update(Student student);

    void delete(int id);

    Student findById(int id);
}
