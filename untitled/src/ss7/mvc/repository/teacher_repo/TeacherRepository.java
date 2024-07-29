package ss7.mvc.repository.teacher_repo;

import ss7.mvc.model.Teacher;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TeacherRepository implements ITeacherRepository {
    private static List<Teacher> list = new LinkedList<>();
    private static int teacherId = 1;
    private static final String CSV_FILE_NAME = "teacher_repo.csv";

    static {
        loadData();
    }

    private static void loadData() {
        // Load data from CSV file
        File file = new File(CSV_FILE_NAME);
        if (file.exists()) {
            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
                String line;
                reader.readLine(); // Skip header line
                while ((line = reader.readLine()) != null) {
                    String[] parts = line.split(",");
                    if (parts.length == 6) {
                        int id = Integer.parseInt(parts[0].trim());
                        String name = parts[1].trim();
                        LocalDate dob = LocalDate.parse(parts[2].trim());
                        String email = parts[3].trim();
                        String phone = parts[4].trim();
                        String className = parts[5].trim();
                        Teacher teacher = new Teacher(id, name, dob, email, phone, className);
                        list.add(teacher);
                        teacherId = Math.max(teacherId, id + 1); // Update teacherId
                    }
                }
            } catch (IOException e) {
                throw new RuntimeException("Error reading data from file", e);
            }
        }
    }

    private static void saveData() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CSV_FILE_NAME))) {
            writer.write("id,name,dateOfBirth,email,phoneNumber,className");
            writer.newLine();
            for (Teacher teacher : list) {
                writer.write(teacher.toCsvString());
                writer.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error writing data to file", e);
        }
    }

    @Override
    public List<Teacher> findAll() {
        return new ArrayList<>(list);
    }

    @Override
    public void add(Teacher teacher) {
        if (teacher != null) {
            teacher.setId(teacherId++);
            list.add(teacher);
            saveData();
        } else {
            throw new IllegalArgumentException("Teacher cannot be null");
        }
    }

    @Override
    public Teacher delete(int id) {
        int index = getIndex(id);
        if (index >= 0) {
            Teacher removedTeacher = list.remove(index);
            saveData();
            return removedTeacher;
        }
        return null;
    }

    @Override
    public void update(int id, Teacher updatedTeacher) {
        int index = getIndex(id);
        if (index >= 0 && updatedTeacher != null) {
            Teacher teacher = list.get(index);

            if (updatedTeacher.getName() != null) {
                teacher.setName(updatedTeacher.getName());
            }
            if (updatedTeacher.getDateOfBirth() != null) {
                teacher.setDateOfBirth(updatedTeacher.getDateOfBirth());
            }
            if (updatedTeacher.getEmail() != null) {
                teacher.setEmail(updatedTeacher.getEmail());
            }
            if (updatedTeacher.getPhoneNumber() != null) {
                teacher.setPhoneNumber(updatedTeacher.getPhoneNumber());
            }
            if (updatedTeacher.getClassName() != null) {
                teacher.setClassName(updatedTeacher.getClassName());
            }
            saveData();
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
        saveData();
    }
}
