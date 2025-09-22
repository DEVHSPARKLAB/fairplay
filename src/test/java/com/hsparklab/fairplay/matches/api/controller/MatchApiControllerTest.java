package com.hsparklab.fairplay.matches.api.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc

class MatchApiControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    @DisplayName("/api/matches Get Request")
    void GetApiMatches() throws Exception{
        // given
        // when
        ResultActions result = mockMvc.perform(get("/api/matches")
                        .accept(MediaType.APPLICATION_JSON)
                );


        // then
        result.andExpect(status().isOk())
              .andExpect(jsonPath("$.count").value(2));

    }

}