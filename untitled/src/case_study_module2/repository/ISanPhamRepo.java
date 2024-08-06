package case_study_module2.repository;

import case_study_module2.model.CacLoaiThucPham;

import java.util.List;

public interface ISanPhamRepo {
 List<CacLoaiThucPham> findAll();
 CacLoaiThucPham findMa(int ma);
 void themSanPham(CacLoaiThucPham thucPham);
 void update(CacLoaiThucPham thucPham);
 boolean xoaSanPham(int ma);
 boolean getNextId(int ma);
}
