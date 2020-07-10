package com.demo.cred_card.web.exception;

public class PropostaIdMismatchException extends RuntimeException {

    public PropostaIdMismatchException() {
        super();
    }

    public PropostaIdMismatchException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public PropostaIdMismatchException(final String message) {
        super(message);
    }

    public PropostaIdMismatchException(final Throwable cause) {
        super(cause);
    }
}
