package quan_ly_phuong_tine.repository;

import quan_ly_phuong_tine.model.PhuongTien;
import quan_ly_phuong_tine.repository.PhuongTienRepo.IPhuongTienRepository;

import java.util.ArrayList;
import java.util.List;

public abstract class PhuongTienRepository<T extends PhuongTien> implements IPhuongTienRepository<T> {
    protected List<T> phuongTienList = new ArrayList<>();

    @Override
    public void add(T phuongTien) {
        phuongTienList.add(phuongTien);
    }

    @Override
    public void remove(String bienKiemSoat) {
        phuongTienList.removeIf(pt -> pt.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    @Override
    public T findByBienKiemSoat(String bienKiemSoat) {
        for (T pt : phuongTienList) {
            if (pt.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat)) {
                return pt;
            }
        }
        return null;
    }

    @Override
    public List<T> getAll() {
        return new ArrayList<>(phuongTienList);
    }
}
