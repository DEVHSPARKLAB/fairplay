package com.hsparklab.fairplay.matches.api.dto;

import lombok.*;

import java.util.List;

@Getter
@ToString
@EqualsAndHashCode
@Builder
public class MatchListResponse {
    private int count;
    private List<MatchDto> matches;
    public static MatchListResponse of(List<MatchDto> items) {
        return MatchListResponse.builder()
                .count(items.size())
                .matches(items)
                .build();
    }
}
