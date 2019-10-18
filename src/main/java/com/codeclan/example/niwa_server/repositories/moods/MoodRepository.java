package com.codeclan.example.niwa_server.repositories.moods;

import com.codeclan.example.niwa_server.models.Mood;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoodRepository extends JpaRepository<Mood, Long> {
}
