package ss7.mvc.sevirce.student_sevirce;

import ss7.mvc.model.Student;
import ss7.mvc.util.ReadAndWrite;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

public class StudentService implements IStudentService {
    private static final String STUDENT_FILE_NAME = "";

    @Override
    public List<Student> findAll() {
        List<String> stringList = ReadAndWrite.readFileCSVToListString(STUDENT_FILE_NAME);
        List<Student> studentList = new ArrayList<>();
        for (String s : stringList) {
            String[] array = s.split(",");

            if (array.length == 6) {
                try {
                    int id = Integer.parseInt(array[0]);
                    String name = array[1];
                    LocalDate dateOfBirth = LocalDate.parse(array[2]);
                    String email = array[3];
                    String phoneNumber = array[4];
                    String className = array[5];
                    Student student = new Student(name, dateOfBirth, email, phoneNumber, className);
                    studentList.add(student);
                } catch (NumberFormatException | DateTimeParseException e) {
                    System.out.println("Lỗi khi phân tích dữ liệu: " + e.getMessage());
                }
            } else {
                System.out.println("Dòng dữ liệu không hợp lệ: " + s);
            }
        }
        return studentList;
    }

    @Override
    public void add(Student student) {
        List<Student> students = findAll();
        students.add(student);
        saveAll(students);
    }

    @Override
    public void update(Student updatedStudent) {
        List<Student> students = findAll();
        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
            if (student.getId() == updatedStudent.getId()) {
                students.set(i, updatedStudent);
                saveAll(students);
                return;
            }
        }
        System.out.println("Học viên với ID " + updatedStudent.getId() + " không tồn tại.");
    }

    @Override
    public boolean delete(int id) {
        List<Student> students = findAll();
        boolean removed = students.removeIf(student -> student.getId() == id);
        if (removed) {
            saveAll(students);
        } else {
            System.out.println("Học viên với ID " + id + " không tồn tại.");
        }
        return removed;
    }

    @Override
    public Student findById(int id) {
        List<Student> students = findAll();
        return students.stream()
                .filter(student -> student.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public int getNextId() {
        List<Student> students = findAll();
        return students.stream()
                .mapToInt(Student::getId)
                .max()
                .orElse(0) + 1;
    }

    private void saveAll(List<Student> students) {
        List<String> stringList = new ArrayList<>();
        for (Student student : students) {
            stringList.add(student.toCsvString());
        }
        ReadAndWrite.writeFileCSVToListString(STUDENT_FILE_NAME + "_" + getNextId(), stringList);
    }
}
