package com.pesf.scheduler.controller;

import com.pesf.scheduler.dto.*;
import jakarta.validation.*;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/schedule")
@RequiredArgsConstructor
public class ScheduleController {

    @GetMapping
    @ResponseBody
    public String getHello(@RequestParam(required = true) int associateNumber) {
        return "Hello " + associateNumber + "!";
    }

    @PostMapping("/reserve")
    public ScheduleResponse reserveSlot (@Valid @RequestBody ScheduleRequest scheduleRequest) {
        return ScheduleResponse.builder()
                .status(1)
                .associateNumber(scheduleRequest.getAssociateNumber())
                .name(scheduleRequest.getName())
                .timeslot(Timeslot.builder()
                        .date(scheduleRequest.getTimeslot().getDate())
                        .hour(scheduleRequest.getTimeslot().getHour())
                        .build())
                .line(scheduleRequest.getLine())
                .build();
    }
}
