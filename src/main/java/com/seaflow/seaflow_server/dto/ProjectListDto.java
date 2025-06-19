package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class ProjectListDto {
    private Integer memberNo;
    private List<ProjectDto> projects;
    
    @Getter
    @Setter
    @NoArgsConstructor
    public static class ProjectDto {
        private Integer no;
        private String projectId;
        private String projectDescription;
        private LocalDateTime createdAt;
    }
} 