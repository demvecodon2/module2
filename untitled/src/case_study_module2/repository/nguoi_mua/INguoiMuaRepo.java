package case_study_module2.repository.nguoi_mua;

import case_study_module2.model.NguoiTieuDung;

import java.util.List;

public interface INguoiMuaRepo {
    List<NguoiTieuDung> findAll();
    NguoiTieuDung findById(String id);
    void save(NguoiTieuDung nguoiTieuDung);
    void deleteById(String id);
    List<String> thongTin();
}
