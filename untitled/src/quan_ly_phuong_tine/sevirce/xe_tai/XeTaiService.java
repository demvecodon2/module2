package quan_ly_phuong_tine.sevirce.xe_tai;

import quan_ly_phuong_tine.model.XeTai;
import java.util.ArrayList;
import java.util.List;

public class XeTaiService implements IXeTaiService {
    private static final List<XeTai> xeTaiList = new ArrayList<>();

    @Override
    public void themXeTai(XeTai xeTai) {
        xeTaiList.add(xeTai);
    }

    @Override
    public void xoaXeTai(String bienKiemSoat) {
        xeTaiList.removeIf(xeTai -> xeTai.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    @Override
    public List<XeTai> hienThiXeTai() {
        return new ArrayList<>(xeTaiList);
    }

    @Override
    public XeTai timKiemXeTai(String bienKiemSoat) {
        return xeTaiList.stream()
                .filter(xeTai -> xeTai.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat))
                .findFirst()
                .orElse(null);
    }
}
