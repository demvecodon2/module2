package quan_ly_phuong_tine.repository.oto;

import quan_ly_phuong_tine.model.Oto;

import java.util.List;

public interface IOtoRepository {
    void addOto(Oto oto);
    void removeOto(String bienKiemSoat);
    void updateOto(Oto oto);
    List<Oto> getAllOto();
}
