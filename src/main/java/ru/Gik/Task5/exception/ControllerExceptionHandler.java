package ru.Gik.Task5.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;
import java.util.Date;

@ControllerAdvice
public class ControllerExceptionHandler {
    @ExceptionHandler(ResourceNotFoundException.class)
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public ErrorMessage resourceNotFoundException(ResourceNotFoundException ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(200, new Date(),"Resource not found","");
        return message;
    }

    @ExceptionHandler(ValidationFieldsException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage validationFieldsException(ValidationFieldsException ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(400, new Date(),"Fields not validated","");
        return message;
    }
    @ExceptionHandler(DuplicatesException.class)
    @ResponseStatus(value = HttpStatus.BAD_REQUEST)
    public ErrorMessage DuplicatesException(ValidationFieldsException ex, WebRequest request) {
        ErrorMessage message = new ErrorMessage(400, new Date(),"Fields are duplicated","");
        return message;
    }

}
