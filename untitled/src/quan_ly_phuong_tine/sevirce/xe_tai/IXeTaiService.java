package quan_ly_phuong_tine.sevirce.xe_tai;

import quan_ly_phuong_tine.model.XeTai;
import java.util.List;

public interface IXeTaiService {
    void themXeTai(XeTai xeTai);
    void xoaXeTai(String bienKiemSoat);
    List<XeTai> hienThiXeTai();
    XeTai timKiemXeTai(String bienKiemSoat);

    XeTai findByBienKiemSoat(String bienKiemSoat);

    void remove(String bienKiemSoat);

    void addXeTai(XeTai xeTai);

    XeTai[] getAllXeTai();

    void removeXeTai(String bienKiemSoat);

    XeTai findXeTaiByBienKiemSoat(String bienKiemSoat);

    List<XeTai> timKiemXeTaiTheoKitu(String kieuTimKiem);
}
