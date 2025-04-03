package com.standup.project.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long boardId;

    @NotBlank
    private String title;

    private List<TaskCard> taskCardList;

    private LocalTime createdAt;

    private LocalTime dueDate;

    @PrePersist
    protected void onCreate() {
        this.createdAt = LocalTime.now();
    }
}
