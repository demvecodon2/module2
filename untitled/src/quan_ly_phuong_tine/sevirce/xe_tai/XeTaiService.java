package quan_ly_phuong_tine.sevirce.xe_tai;

import quan_ly_phuong_tine.model.XeTai;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<XeTai> timKiemXeTaiTheoKitu(String kieuTimKiem) {
        return xeTaiList.stream()
                .filter(xeTai -> xeTai.getBienKiemSoat().toLowerCase().contains(kieuTimKiem.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Implementing methods with proper functionality

    @Override
    public XeTai findByBienKiemSoat(String bienKiemSoat) {
        return timKiemXeTai(bienKiemSoat);
    }

    @Override
    public void remove(String bienKiemSoat) {
        xoaXeTai(bienKiemSoat);
    }

    @Override
    public void addXeTai(XeTai xeTai) {
        themXeTai(xeTai);
    }

    @Override
    public XeTai[] getAllXeTai() {
        return xeTaiList.toArray(new XeTai[0]);
    }

    @Override
    public void removeXeTai(String bienKiemSoat) {
        xoaXeTai(bienKiemSoat);
    }

    @Override
    public XeTai findXeTaiByBienKiemSoat(String bienKiemSoat) {
        return timKiemXeTai(bienKiemSoat);
    }
}
