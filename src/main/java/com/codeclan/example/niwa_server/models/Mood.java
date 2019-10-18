package com.codeclan.example.niwa_server.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "moods")
public class Mood {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private Date time;
    private int rating;
    private String tag;

    @JsonIgnoreProperties("mood")
    @ManyToOne
    @JoinColumn(name = "day_id", nullable = false)
    private Day day;

    public Mood() {
    }

    public Mood(Date time, int rating, Day day) {
        this.time = time;
        this.rating = rating;
        this.tag = "";
        this.day = day;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Day getDay() {
        return day;
    }

    public void setDay(Day day) {
        this.day = day;
    }
}
