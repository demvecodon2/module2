package quan_ly_phuong_tine.repository.xe_may;

import quan_ly_phuong_tine.model.XeMay;
import quan_ly_phuong_tine.repository.PhuongTienRepo.IPhuongTienRepository;

import java.util.ArrayList;
import java.util.List;

public class XeMayRepository implements IPhuongTienRepository<XeMay> {
    private List<XeMay> xeMayList;

    public XeMayRepository() {
        this.xeMayList = new ArrayList<>();
    }

    @Override
    public void add(XeMay xeMay) {
        xeMayList.add(xeMay);
    }

    @Override
    public void remove(String bienKiemSoat) {
        xeMayList.removeIf(xeMay -> xeMay.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    @Override
    public XeMay findByBienKiemSoat(String bienKiemSoat) {
        return xeMayList.stream()
                .filter(xeMay -> xeMay.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<XeMay> getAll() {
        return new ArrayList<>(xeMayList);
    }
}
