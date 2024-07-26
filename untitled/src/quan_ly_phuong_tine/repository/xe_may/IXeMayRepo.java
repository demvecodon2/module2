package quan_ly_phuong_tine.repository.xe_may;

import quan_ly_phuong_tine.model.XeMay;

import java.util.List;

public interface IXeMayRepo {
 void add (XeMay xeMay);
 void remove (XeMay xeMay);
 void delete (int index ,String bienKiemSoat);
 List<XeMay> findAll ();
}
