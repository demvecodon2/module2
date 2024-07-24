package quan_ly_phuong_tien.sevirce.Oto;

import quan_ly_phuong_tien.model.Oto;
import java.util.ArrayList;
import java.util.List;

public class OtoService implements IOtoService {
    private List<Oto> danhSachOto;

    public OtoService() {
        danhSachOto = new ArrayList<>();
    }

    @Override
    public void addOto(Oto oto) {
        danhSachOto.add(oto);
        System.out.println("ĐÃ THÊM OTO: " + oto);
    }

    @Override
    public void removeOto(String bienKiemSoat) {
        Oto otoToRemove = null;
        for (Oto oto : danhSachOto) {
            if (oto.getBienKiemSoat().equals(bienKiemSoat)) {
                otoToRemove = oto;
                break;
            }
        }
        if (otoToRemove != null) {
            danhSachOto.remove(otoToRemove);
            System.out.println("ĐÃ XOÁ OTO: " + otoToRemove);
        } else {
            System.out.println("KHÔNG TÌM THẤY BIỂN KIỂM SOÁT NÀY: " + bienKiemSoat);
        }
    }

    @Override
    public List<Oto> getAllOto() {
        return new ArrayList<>(danhSachOto);
    }
}
