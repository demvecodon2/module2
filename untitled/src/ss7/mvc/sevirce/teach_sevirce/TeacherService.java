package ss7.mvc.sevirce.teach_sevirce;

import ss7.mvc.model.Teacher;
import ss7.mvc.repository.teacher_repo.ITeacherRepository;

import java.util.ArrayList;
import java.util.LinkedList;


public class TeacherService implements ss7.mvc.service.teacher_service.ITeacherService {
    private ITeacherRepository teacherRepository;

    public TeacherService(ITeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public void add(Teacher teacher) {
        if (teacher != null) {
            teacherRepository.add(teacher);
        } else {
            throw new IllegalArgumentException("Teacher cannot be null");
        }
    }

    @Override
    public ArrayList<Teacher> findAll() {
        return (ArrayList<Teacher>) teacherRepository.findAll();
    }

    @Override
    public boolean exists(int id) {
        return !teacherRepository.isEmpty(id);
    }

    @Override
    public void edit(Teacher teacher) {
        if (teacher != null) {
            int id = teacher.getId();
            if (exists(id)) {
                int index = teacherRepository.getIndex(id);
                teacherRepository.update(index, teacher);
            } else {
                throw new IllegalArgumentException("Teacher with ID " + id + " does not exist.");
            }
        } else {
            throw new IllegalArgumentException("Teacher cannot be null");
        }
    }

    @Override
    public void delete(int id) {
        if (exists(id)) {
            teacherRepository.delete(id);
        } else {
            throw new IllegalArgumentException("Teacher with ID " + id + " does not exist.");
        }
    }

    @Override
    public Teacher findById(int id) {
        return teacherRepository.findAll().stream()
                .filter(teacher -> teacher.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
