package com.codeclan.example.niwa_server.components;

import com.codeclan.example.niwa_server.models.Day;
import com.codeclan.example.niwa_server.models.Mood;
import com.codeclan.example.niwa_server.repositories.days.DayRepository;
import com.codeclan.example.niwa_server.repositories.moods.MoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    DayRepository dayRepository;

    @Autowired
    MoodRepository moodRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args){
        Date date = new Date();

        Day day = new Day(date);
        dayRepository.save(day);

        Mood mood = new Mood(date, 4, day);
        moodRepository.save(mood);

        Mood mood2 = new Mood(date, 3, day);
        moodRepository.save(mood2);

        day.addMood(mood);
        dayRepository.save(day);

    }
}
