package com.example.sd19304.controller;

import com.example.sd19304.model.HocSinh;
import com.example.sd19304.repository.HocSinhRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

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

    @PostMapping("/hoc-sinh/add")
    public String add(HocSinh hocSinh) {
        hocSinhRepo.save(hocSinh);
        return "redirect:/hoc-sinh/hien-thi";
    }

    @GetMapping("/hoc-sinh/detail/{id}")
    public String detail(Model model,
                         @PathVariable("id") Integer id) {
        // chuyen doi optional -> object => can su dung .get()
        HocSinh hocSinh = hocSinhRepo.findById(id).get();
        model.addAttribute("hocSinh", hocSinh);
        return "detail.html";
    }

    @GetMapping("/hoc-sinh/delete/{id}")
    public String delete(Model model,
                         @PathVariable("id") Integer id) {
        // chuyen doi optional -> object => can su dung .get()
        hocSinhRepo.deleteById(id);
        return "redirect:/hoc-sinh/hien-thi";
    }

    @PostMapping("/hoc-sinh/update/{id}")
    public String update(Model model,
                         HocSinh hocSinh) {
        System.out.println("da chay vao day , id la: " + hocSinh.getId());
        hocSinhRepo.save(hocSinh);
        return "redirect:/hoc-sinh/hien-thi";
    }
}
