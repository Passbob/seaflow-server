package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiKeyValidationDto {
    private String secretKey;
    private Integer memberNo;
    private boolean isValid;
} 