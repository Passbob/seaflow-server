package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class FlowLogRequestDto {
    private String projectName;
    private String title;
    private String logText;
    private String requestJson;
} 