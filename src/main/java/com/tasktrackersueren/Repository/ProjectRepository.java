package com.tasktrackersueren.Repository;


import com.tasktrackersueren.Entities.ProjectEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<ProjectEntity, Integer> {

}
