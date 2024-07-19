package ss7.mvc.sevirce.teach_sevirce;

import ss7.mvc.model.Tecaher;

import java.util.List;

public interface ITeacherService {
    void add(Tecaher tecaher);
    List<Tecaher> findAll();
}
