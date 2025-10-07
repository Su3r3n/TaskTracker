package com.tasktrackersueren.Mappers;


import com.tasktrackersueren.Dto.ProjectDto;
import com.tasktrackersueren.Entities.ProjectEntity;
import org.springframework.stereotype.Component;

@Component
public class ProjectDtoMapper {
    private ProjectDto projectDto(ProjectEntity entity) {
    ProjectDto projectDto = new ProjectDto();
    return ProjectDto.builder()
            .id(entity.getId())
            .name(entity.getName())
            .createdAt(entity.getCreatedAt())
            .build();
    };
}