package com.hsparklab.fairplay.matches.api.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class MatchDto {
    private final Long id;
    private final String matchNm;
}
