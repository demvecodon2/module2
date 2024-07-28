package quan_ly_phuong_tine.sevirce.Oto;

import quan_ly_phuong_tine.model.Oto;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public Oto findByBienKiemSoat(String bienKiemSoat) {
        return timKiemOto(bienKiemSoat);
    }

    @Override
    public void remove(String bienKiemSoat) {
        xoaOto(bienKiemSoat);
    }

    @Override
    public void addOto(Oto oto) {
        themOto(oto);
    }

    @Override
    public Oto[] getAllOto() {
        return otoList.toArray(new Oto[0]);
    }

    @Override
    public void removeOto(String bienKiemSoat) {
        xoaOto(bienKiemSoat);
    }

    @Override
    public Oto findOtoByBienKiemSoat(String bienKiemSoat) {
        return timKiemOto(bienKiemSoat);
    }

    @Override
    public Oto[] getAll() {
        return getAllOto();
    }

    @Override
    public List<Oto> timKiemOtoTheoKitu(String kieuTimKiem) {
        return otoList.stream()
                .filter(oto -> oto.getBienKiemSoat().toLowerCase().contains(kieuTimKiem.toLowerCase()))
                .collect(Collectors.toList());
    }
}
