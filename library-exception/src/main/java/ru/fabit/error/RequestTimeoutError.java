package ru.fabit.error;


public class RequestTimeoutError extends Exception {
    public RequestTimeoutError() {
        super();
    }
    public RequestTimeoutError(String detailMessage) {
        super(detailMessage);
    }
}
