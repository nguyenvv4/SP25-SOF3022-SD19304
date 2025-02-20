package com.example.sd19304.repository;

import com.example.sd19304.model.NhanVien;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface NhanVienRepo extends JpaRepository<NhanVien, Integer> {

    @Query(value = "select * from nhan_vien " +
            " where ho_ten_nhan_vien = :ten " +
            " And trang_thai=:trangThai", nativeQuery = true)
    List<NhanVien> timKiemTenVaTrangThai(String ten, String trangThai);

    Page<NhanVien> findByHoTenNhanVienOrTrangThai(String ten, String trangThai, Pageable pageable);
}
