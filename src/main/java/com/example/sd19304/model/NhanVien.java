package com.example.sd19304.model;


import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "nhan_vien")
@Data

public class NhanVien {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "ho_ten_nhan_vien")
    private String hoTenNhanVien;


    @Column(name = "dia_chi")
    private String diaChi;


    @Column(name = "sdt")
    private String sdt;


    @Column(name = "trang_thai")
    private String trangThai;

    @Column(name = "ngay_tao", updatable = false)
    @Temporal(TemporalType.DATE)
    private Date ngayTao;

    @Temporal(TemporalType.DATE)
    @Column(name = "ngay_sua")
    private Date ngaySua;
}

