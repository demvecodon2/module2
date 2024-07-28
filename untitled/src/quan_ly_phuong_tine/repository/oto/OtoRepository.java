package quan_ly_phuong_tine.repository.oto;

import quan_ly_phuong_tine.model.Oto;
import quan_ly_phuong_tine.repository.PhuongTienRepo.IPhuongTienRepository;

import java.util.ArrayList;
import java.util.List;

public class OtoRepository implements IPhuongTienRepository<Oto> {
    private List<Oto> otoList;

    public OtoRepository(List<Oto> otoList) {
        this.otoList = new ArrayList<>();
    }

    @Override
    public void add(Oto oto) {
        otoList.add(oto);
    }

    @Override
    public void remove(String bienKiemSoat) {
        otoList.removeIf(oto -> oto.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    @Override
    public Oto findByBienKiemSoat(String bienKiemSoat) {
        return otoList.stream()
                .filter(oto -> oto.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Oto> getAll() {
        return new ArrayList<>(otoList);
    }
}
