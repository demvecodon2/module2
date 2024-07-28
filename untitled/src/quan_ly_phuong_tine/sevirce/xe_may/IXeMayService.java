package quan_ly_phuong_tine.sevirce.xe_may;

import quan_ly_phuong_tine.model.XeMay;
import java.util.List;

public interface IXeMayService {
    void themXeMay(XeMay xeMay);
    void xoaXeMay(String bienKiemSoat);
    List<XeMay> hienThiXeMay();
    XeMay timKiemXeMay(String bienKiemSoat);

    XeMay findByBienKiemSoat(String bienKiemSoat);

    void remove(String bienKiemSoat);

    void addXeMay(XeMay xeMay);

    XeMay[] getAllXeMay();

    void removeXeMay(String bienKiemSoat);

    XeMay findXeMayByBienKiemSoat(String bienKiemSoat);

    List<XeMay> timKiemXeMayTheoKitu(String kieuTimKiem);
}
