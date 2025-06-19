package com.seaflow.seaflow_server.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ApiResponseDto<T> {
    private boolean success;
    private String message;
    private T data;
    
    public ApiResponseDto(boolean success, String message) {
        this.success = success;
        this.message = message;
    }
    
    public ApiResponseDto(boolean success, String message, T data) {
        this.success = success;
        this.message = message;
        this.data = data;
    }
    
    public static <T> ApiResponseDto<T> success(String message) {
        return new ApiResponseDto<>(true, message);
    }
    
    public static <T> ApiResponseDto<T> success(String message, T data) {
        return new ApiResponseDto<>(true, message, data);
    }
    
    public static <T> ApiResponseDto<T> error(String message) {
        return new ApiResponseDto<>(false, message);
    }
} 