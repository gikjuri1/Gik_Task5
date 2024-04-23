package ru.Gik.Task5.exception;

public class DuplicatesException extends RuntimeException{
    private static final long serialVersionUID = 1L;

    public DuplicatesException(String msg) {
        super(msg);
    }

}
