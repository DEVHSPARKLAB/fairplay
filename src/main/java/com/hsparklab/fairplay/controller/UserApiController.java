package com.hsparklab.fairplay.controller;

import com.hsparklab.fairplay.dto.RegistMemberRequest;
import com.hsparklab.fairplay.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RequiredArgsConstructor
@Controller
public class UserApiController {
    private final MemberService memberService;

    @PostMapping("/user")
    public String signup (@ModelAttribute RegistMemberRequest request){
        System.out.println(request.getEmail());
        System.out.println(request.getPassword());
        memberService.save(request);
        return "redirect:/login";

    }
}
