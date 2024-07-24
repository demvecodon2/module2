package quan_ly_phuong_tien.sevirce.Oto;

import quan_ly_phuong_tien.model.Oto;
import java.util.List;

public interface IOtoService {
    void addOto(Oto oto);
    void removeOto(String bienKiemSoat);
    List<Oto> getAllOto();
}