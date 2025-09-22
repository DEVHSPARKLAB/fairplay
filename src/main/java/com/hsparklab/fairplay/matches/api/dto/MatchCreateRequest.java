package com.hsparklab.fairplay.matches.api.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class MatchCreateRequest {
    @NotBlank
    private String title;
    @NotBlank
    private String workPlace;


}
