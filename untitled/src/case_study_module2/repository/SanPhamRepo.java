package case_study_module2.repository;

import case_study_module2.model.CacLoaiThucPham;
import case_study_module2.util.LuuVaHienThi;


import java.util.ArrayList;
import java.util.List;

public class SanPhamRepo implements ISanPhamRepo {

    private List<CacLoaiThucPham> danhSachSanPham = new ArrayList<>();
    private int currentId = 1;
    private static final String SAN_PHAM_FILE = "src/case_study_module2/data/SanPham.csv";

    public SanPhamRepo() {
        loadFromCSV();
    }

    @Override
    public List<CacLoaiThucPham> findAll() {
        return new ArrayList<>(danhSachSanPham);
    }

    @Override
    public CacLoaiThucPham findMa(int ma) {
        return danhSachSanPham.stream()
                .filter(sp -> sp.getMa() == ma)
                .findFirst()
                .orElse(null);
    }

    @Override
    public void themSanPham(CacLoaiThucPham thucPham) {
        thucPham.setMa(currentId++);
        danhSachSanPham.add(thucPham);
        saveToCSV();
    }

    @Override
    public void update(CacLoaiThucPham thucPham) {
        int index = danhSachSanPham.indexOf(findMa(thucPham.getMa()));
        if (index != -1) {
            danhSachSanPham.set(index, thucPham);
            saveToCSV();
        }
    }

    @Override
    public boolean xoaSanPham(int ma) {
        boolean removed = danhSachSanPham.removeIf(sp -> sp.getMa() == ma);
        if (removed) {
            saveToCSV();
        }
        return removed;
    }

    @Override
    public boolean getNextId(int ma) {
        return getNextId(danhSachSanPham.indexOf(findMa(ma)));
    }

    private void loadFromCSV() {
        List<String> lines = LuuVaHienThi.readFileCSVToListString(SAN_PHAM_FILE);
        for (String line : lines) {
            CacLoaiThucPham thucPham = CacLoaiThucPham.fromCSVString(line);
            danhSachSanPham.add(thucPham);
            if (thucPham.getMa() >= currentId) {
                currentId = thucPham.getMa() + 1;
            }
        }
    }

    private void saveToCSV() {
        List<String> lines = new ArrayList<>();
        for (CacLoaiThucPham thucPham : danhSachSanPham) {
            lines.add(thucPham.toCSVString());
        }
        LuuVaHienThi.writeFileCSVToListString(SAN_PHAM_FILE, lines, false);
    }
}
