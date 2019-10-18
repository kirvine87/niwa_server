package com.codeclan.example.niwa_server.repositories.days;

import com.codeclan.example.niwa_server.models.Day;

import java.util.List;

public interface DayRepositoryCustom {

    List<Day> getDaysByIdBetween(Long id1, Long id2);

}
