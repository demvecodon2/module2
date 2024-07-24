package ss7.mvc.sevirce.teach_sevirce.teacher_service;

import ss7.mvc.model.Teacher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public interface ITeacherService {
    ArrayList<Teacher> findAll();
    void add(Teacher teacher);
    boolean exists(int id);
    void edit(Teacher teacher);
    void delete(int id);
    Teacher findById(int id);
}