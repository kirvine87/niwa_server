package com.codeclan.example.niwa_server.repositories.days;

import com.codeclan.example.niwa_server.models.Day;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface DayRepository extends JpaRepository<Day, Long>, DayRepositoryCustom {
    List<Day> getDaysByIdBetween(Long id1, Long id2);

    List<Day> findTopByOrderByIdDesc();

    List<Day> findTop7ByOrderByIdDesc();
}
