package com.tasktrackersueren.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name ="task_state")
public class TaskState {
    private long Id;
    private String name;
    private String description;
    private Long ordinal;
    private TaskStatus taskStatus;
    private TaskPriority taskPriority;
    private TaskCategory taskCategory;
    private Instant CreatedAt = Instant.now();
    private Instant TaskDueDate;
    private Instant TaskDueTime;
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

    @OneToMany(cascade = CascadeType.ALL)
    private List<Task> tasks;
}
