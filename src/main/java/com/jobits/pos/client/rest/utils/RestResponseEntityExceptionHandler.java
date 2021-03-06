/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jobits.pos.client.rest.utils;

import java.util.ArrayList;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import static org.springframework.web.servlet.function.RequestPredicates.headers;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

/**
 *
 * JoBits
 *
 * @author Jorge
 *
 */
@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value
            = {Exception.class})
    protected ResponseEntity<Object> handleConflict(
            Exception ex, WebRequest request) {

        List<String> errors = new ArrayList();
        errors.add(ex.getMessage());
        errors.add(ex.toString());
        for (StackTraceElement s : ex.getStackTrace()) {
            if (s.getClassName().contains("com.jobits.pos")) {
                errors.add("Trace: {Class: "
                        + s.getClassName()
                        + " [" + s.getLineNumber() + "]}");
            }
        }

        ApiError apiError
                = new ApiError(HttpStatus.INTERNAL_SERVER_ERROR.value(), ex.getLocalizedMessage(), errors);
        return new ResponseEntity(apiError, HttpStatus.valueOf(apiError.getStatus()));

    }
    
    
}
