package com.tasktrackersueren.Mappers;

import com.tasktrackersueren.Dto.TaskDto;
import com.tasktrackersueren.Entities.TaskEntity;
import org.springframework.stereotype.Component;

@Component
public class TaskStateDtoMapper {
    private static TaskDto taskDto(TaskEntity task) {
        TaskDto taskDto = new TaskDto();
        taskDto.setTaskNameDto(task.getTaskName());
        return taskDto;
    }
}
