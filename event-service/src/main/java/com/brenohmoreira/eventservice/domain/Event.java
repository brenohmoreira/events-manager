package com.brenohmoreira.eventservice.domain;

import com.brenohmoreira.eventservice.dtos.EventRequestDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "event")
@Table(name = "event")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String date;
    private String title;
    private String description;
    private int maxParticipants;
    private int registeredParticipants;

    public Event(EventRequestDTO eventRequestDTO) {
        this.date = eventRequestDTO.date();
        this.maxParticipants = eventRequestDTO.maxParticipants();
        this.title = eventRequestDTO.title();
        this.description = eventRequestDTO.description();
        this.registeredParticipants = eventRequestDTO.registeredParticipants();
    }
}
