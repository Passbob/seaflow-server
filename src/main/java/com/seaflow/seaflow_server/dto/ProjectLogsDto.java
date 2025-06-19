package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProjectLogsDto {
    private Integer projectNo;
    private String projectId;
    private String projectDescription;
    private List<FlowLogResponseDto> logs;
} 