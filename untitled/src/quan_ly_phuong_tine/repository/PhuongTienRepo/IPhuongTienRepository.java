package quan_ly_phuong_tine.repository.PhuongTienRepo;

import quan_ly_phuong_tine.model.PhuongTien;

import java.util.List;

public interface IPhuongTienRepository<T extends PhuongTien> {
    // Thêm phương tiện vào danh sách
    void add(T phuongTien);

    // Xóa phương tiện dựa trên biển kiểm soát
    void remove(String bienKiemSoat);

    // Tìm phương tiện theo biển kiểm soát
    T findByBienKiemSoat(String bienKiemSoat);

    // Lấy danh sách tất cả các phương tiện
    List<T> getAll();
}
