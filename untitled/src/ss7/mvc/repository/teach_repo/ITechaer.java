package ss7.mvc.repository.teach_repo;

import ss7.mvc.model.Tecaher;

import java.util.List;

public interface ITechaer {
    List<Tecaher> findAll();

    void add(Tecaher tecaher);
}
