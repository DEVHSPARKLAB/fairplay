package com.hsparklab.fairplay.matches.api.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MatchSearchRequest {
    @Min(0)
    private int offset = 0;

    @Min(1) @Max(100)
    private int limit = 20;

    @Pattern(regexp = "PREPARING|ON_GOING|CANCELED", message = "invalid status")
    private String status;    // 기본값 없음
}
