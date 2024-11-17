package com.lentra.SecurityApp.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class Response {
    private String message;
    private int statusCode;
    private boolean success;
}
