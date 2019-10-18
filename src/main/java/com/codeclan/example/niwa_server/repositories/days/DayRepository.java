package com.codeclan.example.niwa_server.repositories.days;

import com.codeclan.example.niwa_server.models.Day;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DayRepository extends JpaRepository<Day, Long>, DayRepositoryCustom {
}
