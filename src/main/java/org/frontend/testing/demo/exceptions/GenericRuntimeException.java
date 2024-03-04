package org.frontend.testing.demo.exceptions;

public class GenericRuntimeException extends RuntimeException {

    public GenericRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public GenericRuntimeException(String message) {
        super(message);
    }

    public GenericRuntimeException(Exception exception) {
        super(exception.getMessage(), null);
    }
}

