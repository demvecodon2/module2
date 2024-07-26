package quan_ly_phuong_tine.sevirce.Oto;

import quan_ly_phuong_tine.model.Oto;
import java.util.ArrayList;
import java.util.List;

public class OtoService implements IOtoService {
    private static final List<Oto> otoList = new ArrayList<>();

    @Override
    public void themOto(Oto oto) {
        otoList.add(oto);
    }

    @Override
    public void xoaOto(String bienKiemSoat) {
        otoList.removeIf(oto -> oto.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat));
    }

    @Override
    public List<Oto> hienThiOto() {
        return new ArrayList<>(otoList);
    }

    @Override
    public Oto timKiemOto(String bienKiemSoat) {
        return otoList.stream()
                .filter(oto -> oto.getBienKiemSoat().equalsIgnoreCase(bienKiemSoat))
                .findFirst()
                .orElse(null);
    }
}
