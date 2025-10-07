package com.tasktrackersueren.Dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE )
public class TaskDto{
    @NonNull
    private String TaskNameDto;


}
