package com.raju.rating.payload;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
@Builder
public class ApiResponse {
    public String message;
    public boolean success;
    public HttpStatus status;
}
