package com.standup.project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
public class SubTaskCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String subTaskId;

    @NotBlank
    private String title;

    @Builder.Default
    private Status status = Status.YET_TO_START;
}
