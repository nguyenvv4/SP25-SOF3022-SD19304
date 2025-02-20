package com.example.sd19304.controller;

import com.example.sd19304.model.NhanVien;
import com.example.sd19304.repository.NhanVienRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class NhanVienController {

    @Autowired
    NhanVienRepo nhanVienRepo;

    @GetMapping("/nhan-vien")
    public String nhanVien(Model model, Pageable pageable) {
//        Page<NhanVien> list = nhanVienRepo.findAll(pageable);
        Page<NhanVien> list =nhanVienRepo.findByHoTenNhanVienOrTrangThai("Nguyen Van A","Active",pageable);
        model.addAttribute("list", list);

//        model.addAttribute("list", list.getContent());
//        System.out.println("tong so phan tu la: "+list.getTotalElements());
//        System.out.println("tong so trang la: "+list.getTotalPages());
//        System.out.println("trang hien tai: "+list.getNumber());

        return "nhan-vien.html";
    }
}
