package com.tasktrackersueren.Mappers;


import com.tasktrackersueren.Entities.TaskEntity;
import com.tasktrackersueren.Dto.TaskDto;
import org.springframework.stereotype.Component;

@Component
public class TaskDtoMapper {
    private static TaskDto taskDto(TaskEntity task) {
    TaskDto taskDto = new TaskDto();
    taskDto.setTaskNameDto(task.getTaskName());
    return taskDto;
    };
}
