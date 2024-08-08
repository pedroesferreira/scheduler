package com.pesf.scheduler.dto;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleRequest {
    private int associateNumber;
    private String name;
    private Timeslot timeslot;
    @NotEmpty(message = "Line cannot be null")
    private String line;
}
