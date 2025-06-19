package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
public class LogDto {
    private Integer no;
    private String projectName;
    private String title;
    private String logText;
    private String requestJson;
    private LocalDateTime createdAt;
} 