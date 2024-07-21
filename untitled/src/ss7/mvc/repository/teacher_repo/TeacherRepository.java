package ss7.mvc.repository.teacher_repo;

import ss7.mvc.model.Teacher;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> list = new LinkedList<>();
    private static int teacherId = 1;

    static {
        Teacher s1 = new Teacher(teacherId++, "Hieu", LocalDate.parse("2001-10-03"), "hieudh@gmail.com", "017256457", "c032");
        Teacher s2 = new Teacher(teacherId++, "Hiseu", LocalDate.parse("1999-10-03"), "hiedudh@gmail.com", "017256457", "c032");
        list.add(s1);
        list.add(s2);
    }

    @Override
    public List<Teacher> findAll() {
        return new LinkedList<>(list);
    }

    @Override
    public void add(Teacher teacher) {
        if (teacher != null) {
            teacher.setId(teacherId++);
            list.add(teacher);
        } else {
            throw new IllegalArgumentException("Teacher cannot be null");
        }
    }

    @Override
    public Teacher delete(int id) {
        int index = getIndex(id);
        if (index >= 0) {
            return list.remove(index);
        }
        return null;
    }

    @Override
    public void update(int id, Teacher updatedTeacher) {
        int index = getIndex(id);
        if (index >= 0 && updatedTeacher != null) {
            Teacher teacher = list.get(index);
            teacher.setName(updatedTeacher.getName());
            teacher.setDateOfBirth(updatedTeacher.getDateOfBirth());
            teacher.setEmail(updatedTeacher.getEmail());
            teacher.setPhoneNumber(updatedTeacher.getPhoneNumber());
            teacher.setClassName(updatedTeacher.getClassName());
        } else {
            throw new IllegalArgumentException("Invalid ID or teacher data");
        }
    }

    @Override
    public boolean isEmpty(int id) {
        return getIndex(id) == -1;
    }

    @Override
    public int getIndex(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void updateData() {

    }
}
