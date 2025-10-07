package com.tasktrackersueren.Repository;

import com.tasktrackersueren.Entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
}
