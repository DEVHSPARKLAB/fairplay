package com.hsparklab.fairplay.dto;


import com.hsparklab.fairplay.domain.Member;
import com.hsparklab.fairplay.repository.MemberRepository;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class registMemberRequest {
    private String email;
    private String password;

    public Member toEntity(){
        return Member.builder()
                .email(this.email)
                .password(this.password)
                .build();
    }

}
