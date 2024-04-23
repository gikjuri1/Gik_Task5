package ru.Gik.Task5.exception;

public class ValidationFieldsException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public ValidationFieldsException(String msg) {
        super(msg);
    }
}
