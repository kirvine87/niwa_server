package com.codeclan.example.niwa_server.repositories.days;

import com.codeclan.example.niwa_server.models.Day;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DayRepository extends JpaRepository<Day, Long>, DayRepositoryCustom {
    List<Day> getDaysByIdBetween(Long id1, Long id2);

    List<Day> findTopByOrderByIdDesc();
}
