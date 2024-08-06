package case_study_module2.repository.nguoi_mua;

import case_study_module2.model.NguoiTieuDung;
import case_study_module2.util.LuuVaHienThi;

import java.util.ArrayList;
import java.util.List;

public class NguoiMuaRepoImpl implements INguoiMuaRepo {
    private static final String NGUOI_MUA_FILE = "src/case_study_module2/data/NguoiMua.csv";
    private List<NguoiTieuDung> danhSachNguoiTieuDung;

    public NguoiMuaRepoImpl() {
        this.danhSachNguoiTieuDung = new ArrayList<>();
        loadFromFile();
    }

    @Override
    public void save(NguoiTieuDung nguoiTieuDung) {
        danhSachNguoiTieuDung.add(nguoiTieuDung);
        saveToFile();
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public List<NguoiTieuDung> findAll() {
        return danhSachNguoiTieuDung;
    }

    @Override
    public NguoiTieuDung findById(String id) {
        return null;
    }

    @Override
    public List<String> thongTin() {
        List<String> thongTinMua = new ArrayList<>();
        for (NguoiTieuDung nguoi : danhSachNguoiTieuDung) {
            thongTinMua.add(nguoi.toString());
        }
        return thongTinMua;
    }

    private void loadFromFile() {
        List<String> lines = LuuVaHienThi.readFileCSVToListString(NGUOI_MUA_FILE);
        for (String line : lines) {
            NguoiTieuDung nguoiTieuDung = NguoiTieuDung.fromCSVString(line);
            danhSachNguoiTieuDung.add(nguoiTieuDung);
        }
    }

    private void saveToFile() {
        List<String> lines = new ArrayList<>();
        for (NguoiTieuDung nguoiTieuDung : danhSachNguoiTieuDung) {
            lines.add(nguoiTieuDung.toCSVString());
        }
        LuuVaHienThi.writeFileCSVToListString(NGUOI_MUA_FILE, lines, false);
    }
}
