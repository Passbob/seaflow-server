package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class FlowLogResponseDto {
    private Integer no;
    private Integer projectNo;
    private String title;
    private String logText;
    private String requestJson;
    private LocalDateTime createdAt;
} 