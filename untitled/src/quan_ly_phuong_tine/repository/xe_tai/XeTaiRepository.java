package quan_ly_phuong_tine.repository.xe_tai;

import quan_ly_phuong_tine.model.XeTai;
import quan_ly_phuong_tine.repository.PhuongTienRepo.IPhuongTienRepository;

import java.util.ArrayList;
import java.util.List;

public class XeTaiRepository implements IPhuongTienRepository<XeTai> {
    private List<XeTai> xeTaiList;

    public XeTaiRepository() {
        this.xeTaiList = new ArrayList<>();
    }

    @Override
    public void add(XeTai xeTai) {
        xeTaiList.add(xeTai);
    }

    @Override
    public void remove(String bienKiemSoat) {
        xeTaiList.removeIf(xeTai -> xeTai.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    @Override
    public XeTai findByBienKiemSoat(String bienKiemSoat) {
        return xeTaiList.stream()
                .filter(xeTai -> xeTai.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<XeTai> getAll() {
        return new ArrayList<>(xeTaiList);
    }
}
