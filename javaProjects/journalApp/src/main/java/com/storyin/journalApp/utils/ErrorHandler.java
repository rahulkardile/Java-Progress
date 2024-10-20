package com.storyin.journalApp.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
public class ErrorHandler {
   private String message;
   private int statusCode;
}
