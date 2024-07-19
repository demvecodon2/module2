package ss7.mvc.sevirce.teach_sevirce;

import ss7.mvc.model.Tecaher;
import ss7.mvc.repository.teach_repo.TeacherRepository;
import ss7.mvc.sevirce.teach_sevirce.ITeacherService;

import java.util.List;

public abstract class TeacherService implements ITeacherService {
                private TeacherRepository teacherRepository = new TeacherRepository() {
        @Override
        public void add(Tecaher teacher) {
            // Implement the add method or use a concrete class
        }
    };

    @Override
    public void add(Tecaher teacher) {
        teacherRepository.add(teacher);
    }

    @Override
    public List<Tecaher> findAll() {
        return teacherRepository.findAll();
    }
}
