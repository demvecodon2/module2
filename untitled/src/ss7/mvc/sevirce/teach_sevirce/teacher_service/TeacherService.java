package ss7.mvc.sevirce.teach_sevirce.teacher_service;

import ss7.mvc.model.Teacher;
import ss7.mvc.repository.teacher_repo.ITeacherRepository;


import ss7.mvc.util.ReadAndWrite;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherService implements ITeacherService {
    private static final String TEACHER_FILE = "src/ss7/mvc/data/teacher.csv";
    private static Scanner scanner = new Scanner(System.in);
    private ITeacherRepository teacherRepository;

    public TeacherService(ITeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> findAll() {
        List<String> stringList = ReadAndWrite.readFileCSVToListString(TEACHER_FILE);
        List<Teacher> teacherList = new ArrayList<>();
        for (String string : stringList) {
            String[] array = string.split(",");
            Teacher teacher = new Teacher(
                    Integer.parseInt(array[0]),
                    array[1],
                    LocalDate.parse(array[2]),
                    array[3],
                    array[4],
                    array[5]
            );
            teacherList.add(teacher);
        }
        return teacherList;
    }

    @Override
    public void add(Teacher teacher) {
        List<Teacher> teachers = findAll();
        teachers.add(teacher);
        List<String> stringList = new ArrayList<>();
        for (Teacher t : teachers) {
            stringList.add(t.toCsvString());
        }
        ReadAndWrite.writeFileCSVToListString(TEACHER_FILE, stringList, true);
    }

    @Override
    public boolean exists(int id) {
        return findAll().stream().anyMatch(teacher -> teacher.getId() == id);
    }

    @Override
    public void edit(Teacher teacher) {
        List<Teacher> teachers = findAll();
        for (int i = 0; i < teachers.size(); i++) {
            if (teachers.get(i).getId() == teacher.getId()) {
                teachers.set(i, teacher);
                break;
            }
        }
        List<String> stringList = new ArrayList<>();
        for (Teacher t : teachers) {
            stringList.add(t.toCsvString());
        }
        ReadAndWrite.writeFileCSVToListString(TEACHER_FILE, stringList, true);
    }

    @Override
    public void delete(int id) {
        List<Teacher> teachers = findAll();
        teachers.removeIf(teacher -> teacher.getId() == id);
        List<String> stringList = new ArrayList<>();
        for (Teacher t : teachers) {
            stringList.add(t.toCsvString());
        }
        ReadAndWrite.writeFileCSVToListString(TEACHER_FILE, stringList, true);
    }

    @Override
    public Teacher findById(int id) {
        return findAll().stream()
                .filter(teacher -> teacher.getId() == id)
                .findFirst()
                .orElse(null);
    }
}
