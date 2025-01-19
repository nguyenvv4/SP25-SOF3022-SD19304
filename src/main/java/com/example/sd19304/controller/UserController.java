package com.example.sd19304.controller;

import com.example.sd19304.model.User;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @GetMapping("/user/hien-thi")
    // để mở form có attribute user thì function phải có
    // modelAttribute có tên là user tuong ứng
    public String home(@ModelAttribute("user") User user, Model model) {
        return "/user/user.html";
    }

    @PostMapping("/user/save")
    public String save(@Valid @ModelAttribute("user") User user, Errors errors) {
        System.out.println(user.toString());
        return "/user/user.html";

    }
}
