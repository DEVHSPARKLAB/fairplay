package com.hsparklab.fairplay.matches.api.controller;

import com.hsparklab.fairplay.matches.api.dto.MatchCreateRequest;
import com.hsparklab.fairplay.matches.api.dto.MatchDto;
import com.hsparklab.fairplay.matches.api.dto.MatchListResponse;
import com.hsparklab.fairplay.matches.api.dto.MatchSearchRequest;
import com.hsparklab.fairplay.matches.api.service.MatchService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/api/matches")
@RequiredArgsConstructor
public class MatchApiController {
    private final MatchService matchService;
    //매치 목록 조회
    @GetMapping
    public ResponseEntity<MatchListResponse> getMatches(MatchSearchRequest search){
        List<MatchDto> matchList =  List.of(
                new MatchDto(1L, "첫번째 경기"),
                new MatchDto(2L, "두번째 경기")
       );
        return ResponseEntity.ok(MatchListResponse.of(matchList));

    }
    @PostMapping
    public ResponseEntity createMatch(@Valid @RequestBody MatchCreateRequest request) {
        return ResponseEntity.ok("ok");

    }
    @GetMapping("/{id}")
    public ResponseEntity getMatchDetail(@PathVariable("id") UUID id){
        return ResponseEntity.ok(id);

    }

}
