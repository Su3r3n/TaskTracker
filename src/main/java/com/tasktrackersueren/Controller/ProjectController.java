package com.tasktrackersueren.Controller;

import com.tasktrackersueren.Dto.ProjectDto;
import com.tasktrackersueren.Mappers.ProjectDtoMapper;
import jakarta.transaction.Transactional;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
@Transactional
public class ProjectController {

    ProjectDtoMapper  projectDtoMapper;
    @PostMapping("/api/projects/")
    public ResponseEntity<ProjectDto> createProject( @RequestBody ProjectDto projectDto) {
        return createProject(projectDto);
    }
    @GetMapping()
    public
}
