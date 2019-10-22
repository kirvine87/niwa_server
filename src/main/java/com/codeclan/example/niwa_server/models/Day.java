package com.codeclan.example.niwa_server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "days")
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Lob
    @Column
    private String journalEntry;

    @Column
    private int waterIntake;

    @Column
    private int calorieIntake;

    @Column
    private Boolean exercised;

    @Column
    private Boolean meditated;

    @Lob
    @Column
    private String win1;

    @Lob
    @Column
    private String win2;

    @Lob
    @Column
    private String win3;

    @Column
    private Date date;

    @JsonIgnoreProperties("day")
    @OneToMany(mappedBy = "day")
    private List<Mood> moods;

    public Day(){

    }

    public Day(Date date) {
        this.journalEntry = "";
        this.waterIntake = 0;
        this.calorieIntake = 0;
        this.exercised = false;
        this.meditated = false;
        this.win1 = "";
        this.win2 = "";
        this.win3 = "";
        this.date = date;
        this.moods = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        id = id;
    }

    public String getJournalEntry() {
        return journalEntry;
    }

    public void setJournalEntry(String journalEntry) {
        this.journalEntry = journalEntry;
    }

    public int getWaterIntake() {
        return waterIntake;
    }

    public void setWaterIntake(int waterIntake) {
        this.waterIntake = waterIntake;
    }

    public int getCalorieIntake() {
        return calorieIntake;
    }

    public void setCalorieIntake(int calorieIntake) {
        this.calorieIntake = calorieIntake;
    }

    public Boolean getExercised() {
        return exercised;
    }

    public void setExercised(Boolean exercised) {
        this.exercised = exercised;
    }

    public Boolean getMeditated() {
        return meditated;
    }

    public void setMeditated(Boolean meditated) {
        this.meditated = meditated;
    }

    public String getWin1() {
        return win1;
    }

    public void setWin1(String win1) {
        this.win1 = win1;
    }

    public String getWin2() {
        return win2;
    }

    public void setWin2(String win2) {
        this.win2 = win2;
    }

    public String getWin3() {
        return win3;
    }

    public void setWin3(String win3) {
        this.win3 = win3;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Mood> getMood() {
        return moods;
    }

    public void setMood(List<Mood> mood) {
        this.moods = mood;
    }
}
