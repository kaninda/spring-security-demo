package com.aka.security.controller.exception;

public class BookNotFoundException extends RuntimeException{
    public BookNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }
    public BookNotFoundException(final String message){
        super(message);
    }

    public BookNotFoundException(final Throwable cause) {
        super(cause);
    }

    public BookNotFoundException() {
        super();
    }
}
