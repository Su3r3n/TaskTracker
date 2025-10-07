package com.tasktrackersueren.Entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "task_state")
public class TaskStateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long Id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private Long ordinal;
    @Enumerated(EnumType.STRING)
    private TaskStatus taskStatus;
    @Enumerated(EnumType.STRING)
    private TaskPriority taskPriority;
    @Enumerated(EnumType.STRING)
    private TaskCategory taskCategory;

    private Instant createdAt = Instant.now();
    private Instant taskDueDate;
    private Instant taskDueTime;
    public enum TaskStatus {
        DONE,
        DOING,
        IN_PLAN,
    }
    public enum TaskPriority {
        Low,
        Medium,
        High,
        Extra,
    }
    public enum TaskCategory {
        Hobby,
        Work,
        Studying,
    }

    @Builder.Default
    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "task_state", referencedColumnName = "id")
    private List<TaskEntity> tasks = new ArrayList<>();
}


