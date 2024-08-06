package case_study_module2.repository.hoa_don;

import case_study_module2.model.CacLoaiThucPham;
import case_study_module2.model.HoaDon;
import case_study_module2.util.LuuVaHienThi;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HoaDonRepoImpl implements IHoaDonRepo {
    private static final String HOA_DON_FILE = "src/case_study_module2/data/HoaDon.csv";

    @Override
    public List<HoaDon> findAll() {
        List<HoaDon> hoaDonList = new ArrayList<>();
        List<String> lines = LuuVaHienThi.readFileCSVToListString(HOA_DON_FILE);
        for (String line : lines) {
            String[] data = line.split(",");
            if (data.length == 4) {
                HoaDon hoaDon = new HoaDon(data[0], data[1], LocalDate.parse(data[2]), Double.parseDouble(data[3]));
                hoaDonList.add(hoaDon);
            }
        }
        return hoaDonList;
    }

    @Override
    public CacLoaiThucPham findMa(int maSanPham) {
        return null;
    }

    @Override
    public HoaDon findById(String maHoaDon) {
        List<String> lines = LuuVaHienThi.readFileCSVToListString(HOA_DON_FILE);
        for (String line : lines) {
            String[] data = line.split(",");
            if (data[0].equals(maHoaDon)) {
                return new HoaDon(data[0], data[1], LocalDate.parse(data[2]), Double.parseDouble(data[3]));
            }
        }
        return null;
    }

    @Override
    public void add(HoaDon hoaDon) {
        List<String> lines = new ArrayList<>();
        lines.add(hoaDon.toCSVFormat());
        LuuVaHienThi.writeFileCSVToListString(HOA_DON_FILE, lines, true);
    }

    @Override
    public boolean delete(String maHoaDon) {
        List<String> lines = LuuVaHienThi.readFileCSVToListString(HOA_DON_FILE);
        List<String> updatedLines = new ArrayList<>();
        boolean deleted = false;
        for (String line : lines) {
            if (!line.startsWith(maHoaDon)) {
                updatedLines.add(line);
            } else {
                deleted = true;
            }
        }
        if (deleted) {
            LuuVaHienThi.writeFileCSVToListString(HOA_DON_FILE, updatedLines, false);
        }
        return deleted;
    }

    @Override
    public void update(HoaDon hoaDon) {
        List<String> lines = LuuVaHienThi.readFileCSVToListString(HOA_DON_FILE);
        List<String> updatedLines = new ArrayList<>();
        for (String line : lines) {
            if (line.startsWith(hoaDon.getMaHoaDon())) {
                updatedLines.add(hoaDon.toCSVFormat());
            } else {
                updatedLines.add(line);
            }
        }
        LuuVaHienThi.writeFileCSVToListString(HOA_DON_FILE, updatedLines, false);
    }
}
