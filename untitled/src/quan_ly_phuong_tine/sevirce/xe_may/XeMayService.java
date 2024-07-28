package quan_ly_phuong_tine.sevirce.xe_may;

import quan_ly_phuong_tine.model.XeMay;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class XeMayService implements IXeMayService {
    private static final List<XeMay> xeMayList = new ArrayList<>();

    @Override
    public void themXeMay(XeMay xeMay) {
        xeMayList.add(xeMay);
    }

    @Override
    public void xoaXeMay(String bienKiemSoat) {
        xeMayList.removeIf(xeMay -> xeMay.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    @Override
    public List<XeMay> hienThiXeMay() {
        return new ArrayList<>(xeMayList);
    }

    @Override
    public XeMay timKiemXeMay(String bienKiemSoat) {
        return xeMayList.stream()
                .filter(xeMay -> xeMay.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat))
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<XeMay> timKiemXeMayTheoKitu(String kieuTimKiem) {
        return xeMayList.stream()
                .filter(xeMay -> xeMay.getBienKiemSoat().toLowerCase().contains(kieuTimKiem.toLowerCase()))
                .collect(Collectors.toList());
    }

    // Implementing methods with proper functionality

    @Override
    public XeMay findByBienKiemSoat(String bienKiemSoat) {
        return timKiemXeMay(bienKiemSoat);
    }

    @Override
    public void remove(String bienKiemSoat) {
        xoaXeMay(bienKiemSoat);
    }

    @Override
    public void addXeMay(XeMay xeMay) {
        themXeMay(xeMay);
    }

    @Override
    public XeMay[] getAllXeMay() {
        return xeMayList.toArray(new XeMay[0]);
    }

    @Override
    public void removeXeMay(String bienKiemSoat) {
        xoaXeMay(bienKiemSoat);
    }

    @Override
    public XeMay findXeMayByBienKiemSoat(String bienKiemSoat) {
        return timKiemXeMay(bienKiemSoat);
    }
}
