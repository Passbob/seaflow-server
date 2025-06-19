package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProjectCreateDto {
    private String projectId;
    private String projectDescription;
} 