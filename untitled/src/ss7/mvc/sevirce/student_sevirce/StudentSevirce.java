package ss7.mvc.sevirce.student_sevirce;

import ss7.mvc.model.Student;
import ss7.mvc.repository.student_repo.IStudentRepository;
import ss7.mvc.repository.student_repo.StudentRepository;

import java.util.List;

public class StudentSevirce implements IStudentSevrice {
    private IStudentRepository studentRepository = new StudentRepository();

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public void add(Student student) {
        studentRepository.add(student);
    }

}

