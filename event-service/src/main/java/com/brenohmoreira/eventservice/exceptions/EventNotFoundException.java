package com.brenohmoreira.eventservice.exceptions;

public class EventNotFoundException extends RuntimeException {

    public EventNotFoundException() {
        super("Event not founded");
    }

    public EventNotFoundException(String message) {
        super(message);
    }
}