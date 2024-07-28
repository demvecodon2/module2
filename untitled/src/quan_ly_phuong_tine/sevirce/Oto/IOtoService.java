package quan_ly_phuong_tine.sevirce.Oto;

import quan_ly_phuong_tine.model.Oto;
import java.util.List;

public interface IOtoService {
    void themOto(Oto oto);
    void xoaOto(String bienKiemSoat);
    List<Oto> hienThiOto();
    Oto timKiemOto(String bienKiemSoat);

    Oto findByBienKiemSoat(String bienKiemSoat);

    void remove(String bienKiemSoat);

    void addOto(Oto oto);

    Oto[] getAllOto();

    void removeOto(String bienKiemSoat);

    Oto findOtoByBienKiemSoat(String bienKiemSoat);

    Oto[] getAll();

    List<Oto> timKiemOtoTheoKitu(String kieuTimKiem);
}
