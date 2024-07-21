package ss7.mvc.service.teacher_service;

import ss7.mvc.model.Teacher;

import java.util.LinkedList;
import java.util.List;

public interface ITeacherService {
    LinkedList<Teacher> findAll();
    void add(Teacher teacher);
    boolean exists(int id);
    void edit(Teacher teacher);
    void delete(int id);
    Teacher findById(int id);
}
