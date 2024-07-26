package quan_ly_phuong_tine.sevirce.xe_tai;

import quan_ly_phuong_tine.model.XeTai;
import java.util.List;

public interface IXeTaiService {
    void themXeTai(XeTai xeTai);
    void xoaXeTai(String bienKiemSoat);
    List<XeTai> hienThiXeTai();
    XeTai timKiemXeTai(String bienKiemSoat);
}
