package ss7.mvc.repository.teach_repo;


import ss7.mvc.model.Tecaher;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class TeacherRepository implements ITechaer {
    private static List<Tecaher> list;

    static {
        list = new ArrayList<>();
        Tecaher s1 = new Tecaher("hieu", LocalDate.parse("2001-01-07"), "hoangngochieuv@gmail.com",
                "812476324", "lv2");
        Tecaher  s2 = new Tecaher("hieu1", LocalDate.parse("2001-01-09"), "hoang2ngochieuv@gmail.com",
                "8212476324", "lv2");
        list.add(s1);
        list.add(s2);
    }

    @Override
        public List<Tecaher> findAll() {
        return new ArrayList<>(list);
    }

    @Override
    public abstract void add(Tecaher teacher);
}
