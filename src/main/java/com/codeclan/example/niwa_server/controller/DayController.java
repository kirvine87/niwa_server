package com.codeclan.example.niwa_server.controller;

import com.codeclan.example.niwa_server.models.Day;
import com.codeclan.example.niwa_server.repositories.days.DayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/api/days")
public class DayController {

    @Autowired
    DayRepository dayRepository;

    @GetMapping(value = "day/{id1}/day/{id2}")
    public List<Day> getWeeksMood(@PathVariable Long id1, @PathVariable Long id2){
        return dayRepository.getDaysByIdBetween(id1, id2);
    }

}
