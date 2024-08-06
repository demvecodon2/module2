package ss7.mvc.repository.teacher_repo;

import ss7.mvc.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public interface ITeacherRepository {
    List<Teacher> teacherList= new ArrayList<Teacher>();

    void add(Teacher teacher);


    void delete(int id);

    boolean exists(int id);

    void update(int index, Teacher teacher);
    Teacher findById(int id);

    List<Teacher> findAll();
}


