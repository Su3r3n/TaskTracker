package com.tasktrackersueren.Repository;

import com.tasktrackersueren.Entities.TaskStateEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskStateRepository extends JpaRepository<TaskStateEntity, Integer> {
}
