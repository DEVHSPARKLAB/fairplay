package com.hsparklab.fairplay.dto;


import com.hsparklab.fairplay.domain.Member;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class RegistMemberRequest {
    private String email;
    private String password;


}
