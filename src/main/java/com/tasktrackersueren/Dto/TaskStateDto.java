package com.tasktrackersueren.Dto;


import com.fasterxml.jackson.annotation.JsonProperty;
import com.tasktrackersueren.Entities.TaskStateEntity;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.Instant;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskStateDto {
    @NonNull
     String name;
    @NonNull
     String description;
     Long ordinal;
    @JsonProperty("task_status")
     TaskStateEntity.TaskStatus taskStatus;
    @JsonProperty("task_priority")
     TaskStateEntity.TaskPriority taskPriority;
    @JsonProperty("task_category")
     TaskStateEntity.TaskCategory taskCategory;
    @JsonProperty("created_at")
     Instant createdAt;
    @JsonProperty("task_due_date")
     Instant taskDueDate;
    @JsonProperty("task_due_time")
     Instant taskDueTime;
}
