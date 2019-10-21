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
        Date date1 = new Date(1571400073000L);
        Date date2 = new Date(1571313673000L);
        Date date3 = new Date(157122727300L);
        Date date4 = new Date(157114087300L);

        Day day = new Day(date1);
        dayRepository.save(day);

        Mood mood = new Mood(date1, 4, day);
        moodRepository.save(mood);

        Mood mood2 = new Mood(date1, 3, day);
        moodRepository.save(mood2);

        Day day2 = new Day(date2);
        dayRepository.save(day2);

        Mood mood3 = new Mood(date2, 4, day2);
        moodRepository.save(mood3);

        Day day3 = new Day(date3);
        dayRepository.save(day3);

        Mood mood4 = new Mood(date3, 4, day3);
        moodRepository.save(mood4);

        day3.setCalorieIntake(500);
        dayRepository.save(day3);

        Day day4 = new Day(date4);
        dayRepository.save(day4);

        Mood mood5 = new Mood(date4, 4, day4);
        moodRepository.save(mood5);

    }
}
