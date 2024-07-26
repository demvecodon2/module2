package tham_khao.sevirce.XeMay;

import quan_ly_phuong_tine.model.XeMay;
import java.util.List;

public interface IXeMayService {
    void themXeMay(XeMay xeMay);
    void xoaXeMay(String bienKiemSoat);
    List<XeMay> hienThiXeMay();
    XeMay timKiemXeMay(String bienKiemSoat);
}
