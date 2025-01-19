package com.example.sd19304.controller;

import com.example.sd19304.model.HocSinh;
import com.example.sd19304.repository.HocSinhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HocSinhController {
    // thong thuogn phai khoi tao thang repo
    // repo r = new repo
    // nhung minh dang dung interface va spring nen repo duoc khoi tao nhu sau
    @Autowired
    HocSinhRepo hocSinhRepo;

    @GetMapping("/hoc-sinh/hien-thi")
    public String hienThi(Model model) {
        // lay danh sach hoc sinh tu db
        List<HocSinh> list = hocSinhRepo.findAll();
        model.addAttribute("list", list);
        return "/hoc-sinh.html";
    }
}
