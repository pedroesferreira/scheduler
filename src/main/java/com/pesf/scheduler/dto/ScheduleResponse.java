package com.pesf.scheduler.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ScheduleResponse {
    private int status;
    private int associateNumber;
    private String name;
    private Timeslot timeslot;
    private String line;
}
