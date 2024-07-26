package quan_ly_phuong_tine.sevirce.Oto;

import quan_ly_phuong_tine.model.Oto;
import java.util.List;

public interface IOtoService {
    void themOto(Oto oto);
    void xoaOto(String bienKiemSoat);
    List<Oto> hienThiOto();
    Oto timKiemOto(String bienKiemSoat);
}
