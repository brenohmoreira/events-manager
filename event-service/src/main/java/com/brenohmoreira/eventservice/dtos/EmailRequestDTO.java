package com.brenohmoreira.eventservice.dtos;

public record EmailRequestDTO(String to, String subject, String body) {
}
