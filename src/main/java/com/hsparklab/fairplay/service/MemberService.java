package com.hsparklab.fairplay.service;

import com.hsparklab.fairplay.domain.Member;
import com.hsparklab.fairplay.dto.RegistMemberRequest;
import com.hsparklab.fairplay.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Transactional
    public Long save(RegistMemberRequest dto){
        return memberRepository.save(Member.builder()
                .email(dto.getEmail())
                .password(bCryptPasswordEncoder.encode(dto.getPassword()))
                .build()).getId();
    }

}
