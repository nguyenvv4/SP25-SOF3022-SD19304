package com.example.sd19304.controller;

import com.example.sd19304.model.Ctsp;
import com.example.sd19304.repository.CtspRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class BanHangController {

    @Autowired
    CtspRepo ctspRepo;

    @GetMapping("/ban-hang")
    public String hienThi(Model model) {
        List<Ctsp> ctspList = ctspRepo.findAll();
        model.addAttribute("ctspList", ctspList);
        return "/ban-hang.html";
    }

    @GetMapping("/them-gio-hang")
    public String themGioHang(Model model, @RequestParam("idCtsp") Integer idCtsp,
                              @RequestParam("soLuong") Integer soLuong) {
        System.out.println("id ctsp : " + idCtsp);
        System.out.println("soLuong : " + soLuong);
        // lay ctsp theo idctsp
        Ctsp ctsp = ctspRepo.findById(idCtsp).get();
        // check soLuongTon
        // Tao hoa don chi tiet

        //Cap nhat lai so luong ton cua ctsp
        ctsp.setSoLuongTon(ctsp.getSoLuongTon() - soLuong);


        return "redirect:/ban-hang";

    }
}
