package hoa_don_tien_dien.sevirce;

import hoa_don_tien_dien.model.KhachHang;

import java.util.List;

public interface IKhachService {
    List<KhachHang> findAll();
    KhachHang findById(String maKhachHang);
    void add(KhachHang khachHang);
    void delete(String maKhachHang);
    List<KhachHang> searchByName(String tenKhachHang);
}
