package ss7.mvc.service.student_service;

import ss7.mvc.model.Student;
import ss7.mvc.repository.student_repo.IStudenRepository;
import ss7.mvc.sevirce.student_sevirce.IStudentService;

import java.util.List;

public class StudentService implements IStudentService {
    private IStudenRepository studentRepository;
    private int currentId;


    public StudentService(IStudenRepository studentRepository) {
        this.studentRepository = studentRepository;
        this.currentId = initializeCurrentId();
    }


    public StudentService() {

    }

    @Override
    public List<Student> findAll() {
        if (studentRepository == null) {
            throw new IllegalStateException("StudentRepository is not initialized.");
        }
        return studentRepository.findAll();
    }

    @Override
    public Student findById(int id) {
        if (studentRepository == null) {
            throw new IllegalStateException("StudentRepository is not initialized.");
        }
        return studentRepository.findById(id);
    }

    @Override
    public void add(Student student) {
        if (studentRepository == null) {
            throw new IllegalStateException("StudentRepository is not initialized.");
        }
        student.setId(getNextId()); // Ensure student ID is set before adding
        studentRepository.add(student);
    }

    @Override
    public void update(Student student) {
        if (studentRepository == null) {
            throw new IllegalStateException("StudentRepository is not initialized.");
        }
        if (studentRepository.exists(student.getId())) {
            studentRepository.update(student);
        } else {
            System.out.println("Student with ID " + student.getId() + " does not exist.");
        }
    }

    @Override
    public boolean delete(int id) {
        if (studentRepository == null) {
            throw new IllegalStateException("StudentRepository is not initialized.");
        }
        if (studentRepository.exists(id)) {
            studentRepository.delete(id);
            return true;
        } else {
            System.out.println("Student with ID " + id + " does not exist.");
            return false;
        }
    }

    @Override
    public int getNextId() {
        return currentId++;
    }

    private int initializeCurrentId() {
        if (studentRepository == null) {
            throw new IllegalStateException("StudentRepository is not initialized.");
        }


        List<Student> students = studentRepository.findAll();
        int maxId = 1;
        for (Student student : students) {
            if (student.getId() >= maxId) {
                maxId = student.getId() + 1;
            }
        }
        return maxId;
    }
}

