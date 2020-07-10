package com.demo.cred_card.web.exception;

public class PropostaNotFoundException extends RuntimeException {

    public PropostaNotFoundException() {
        super();
    }

    public PropostaNotFoundException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PropostaNotFoundException(final String message) {
        super(message);
    }

    public PropostaNotFoundException(final Throwable cause) {
        super(cause);
    }
}