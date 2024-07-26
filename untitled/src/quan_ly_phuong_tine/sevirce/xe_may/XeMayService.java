package quan_ly_phuong_tine.sevirce.xe_may;

import quan_ly_phuong_tine.model.XeMay;
import ss7.demo.IBay;

import java.util.ArrayList;
import java.util.List;

public class XeMayService implements tham_khao.sevirce.XeMay.IXeMayService {
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
}
