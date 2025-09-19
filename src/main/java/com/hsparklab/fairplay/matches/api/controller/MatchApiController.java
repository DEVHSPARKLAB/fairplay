package com.hsparklab.fairplay.matches.api.controller;

import com.hsparklab.fairplay.matches.api.dto.MatchDto;
import com.hsparklab.fairplay.matches.api.dto.MatchListResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/matches")
@RequiredArgsConstructor
public class MatchApiController {
    //매치 목록 조회
    @GetMapping
    public ResponseEntity<MatchListResponse> get(){
        List<MatchDto> matchList =  List.of(
                new MatchDto(1L, "첫번째 경기"),
                new MatchDto(2L, "두번째 경기")
        );
        return ResponseEntity.ok((MatchListResponse.builder()
                .matches(matchList)
                .build()));

    }

}
