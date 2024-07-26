package quan_ly_phuong_tine.repository.PhuongTienRepo;

import quan_ly_phuong_tine.model.PhuongTien;

import java.util.List;

public interface IPhuongTienRepository<T extends PhuongTien> {
    void add(T phuongTien);
    void remove(String bienKiemSoat);
    T findByBienKiemSoat(String bienKiemSoat);
    List<T> getAll();
}
