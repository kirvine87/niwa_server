package com.codeclan.example.niwa_server.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "days")
public class Day {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

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

    @Column
    private String win1;

    @Column
    private String win2;

    @Column
    private String win3;

    @Column
    private Date date;

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
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
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
}
