package com.demo.cred_card.web.exception;

public class ClienteNotFoundException extends RuntimeException {

    public ClienteNotFoundException() {
        super();
    }

    public ClienteNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public ClienteNotFoundException(final String message) {
        super(message);
    }

    public ClienteNotFoundException(final Throwable cause) {
        super(cause);
    }
}