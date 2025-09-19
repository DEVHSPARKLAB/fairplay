package com.hsparklab.fairplay.matches.api.entity;

import jakarta.persistence.*;
import lombok.Getter;


@Entity
@Getter
public class Match {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "match_nm", nullable = false, length = 64)
    private String matchNm;
}
