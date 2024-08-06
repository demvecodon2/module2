package hoa_don_tien_dien.repository.khach_nuoc_ngoai;

import hoa_don_tien_dien.model.KhachHangNuocNgoai;

import java.util.List;

public interface IKhachNuocNgoai {
    List<KhachHangNuocNgoai> findAll();
    KhachHangNuocNgoai findById(int maKhachNuocNgoai);
    void add(KhachHangNuocNgoai khachNuocNgoai);
    void delete(int maKhachNuocNgoai);
    List<KhachHangNuocNgoai> searchByName(String tenKhachNuocNgoai);
}
