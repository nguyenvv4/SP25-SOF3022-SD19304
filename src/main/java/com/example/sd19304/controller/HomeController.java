package com.example.sd19304.controller;

import com.example.sd19304.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class HomeController {

    // khoi tao duong dan /home voi phuong thuc get
    @GetMapping("/home")
    public String home(Model model) {
        System.out.println("Da chay vao day");
        model.addAttribute("hoTen", "Nguyen Van A");
        User user = new User(1, "Nguyen Van B", 25, "Ha noi");
        model.addAttribute("user", user);
        // return den duong dan cua file html
        return "/home.html";
    }

    @PostMapping("/login")
    public String login(String email,
                        String pass,
                        Model model,
                        RedirectAttributes redirectAttributes) {
        System.out.println(email);
        System.out.println(pass);
// xu ly logic
        if (email.equals("nguyenvv4@fpt.edu.vn") && pass.equals("123")) {
            // login thanh cong => chuyen tiep den duong /user
            System.out.println("dang nhap thanh cong");
//            model.addAttribute("message","forward");
//            return "forward:/user/hien-thi";
            redirectAttributes.addAttribute("message", "redirect");
            return "redirect:/user/hien-thi";

        } else {
            // login that bai => mo trang login that bai
            System.out.println("dang nhap that bai");
            return "";
        }
    }


}
