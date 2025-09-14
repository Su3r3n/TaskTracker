package com.tasktrackersueren.Model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "Project")
public class Project {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Getter
    @Setter
    private long id;
    @NotNull
    @Getter @Setter
    private String name;
    @Getter @Setter
    private Instant createdAt= Instant.now();

    @OneToMany(cascade = CascadeType.ALL)
    public List<TaskState> taskStates;
}
