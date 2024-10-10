package com.hsparklab.fairplay.controller;

import com.hsparklab.fairplay.dto.RegistMemberRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserViewController {
    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/signup")
    public String signup(Model model){
        model.addAttribute("request", new RegistMemberRequest());
        return "signup";
    }
}
