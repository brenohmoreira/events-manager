package com.brenohmoreira.eventservice.exceptions;

public class EventFullException extends RuntimeException {

    public EventFullException() {
        super("Event is full");
    }

    public EventFullException(String message) {
        super(message);
    }
}