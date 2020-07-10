package com.demo.cred_card.web.exception;

public class ClienteIdMismatchException extends RuntimeException {

    public ClienteIdMismatchException() {
        super();
    }

    public ClienteIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ClienteIdMismatchException(final String message) {
        super(message);
    }

    public ClienteIdMismatchException(final Throwable cause) {
        super(cause);
    }
}
