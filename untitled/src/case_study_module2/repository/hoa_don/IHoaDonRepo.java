package case_study_module2.repository.hoa_don;

import case_study_module2.model.CacLoaiThucPham;
import case_study_module2.model.HoaDon;
import java.util.List;

public interface IHoaDonRepo {
    void add(HoaDon hoaDon);
   void update(HoaDon hoaDon);
    boolean delete(String maHoaDon);
    HoaDon findById(String maHoaDon);
    List<HoaDon> findAll();
    CacLoaiThucPham findMa(int maSanPham);

}
