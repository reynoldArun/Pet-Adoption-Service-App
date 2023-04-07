package com.PetAdoptionService.Exceptions;

import com.PetAdoptionService.Entity.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(NullPointerException.class)
    public ResponseEntity<ApiResponse>NullPointerException(NullPointerException ex) {
        ApiResponse apiResponse = new ApiResponse();
        apiResponse.setMessage("User not found!!");
        return new ResponseEntity<>(apiResponse, HttpStatus.BAD_REQUEST);
    }
}
