package com.ozael.domain;

import java.time.LocalDate;

public class Mentoring extends Content {


    private LocalDate date;

    public Mentoring(LocalDate date) {
        this.date = date;
    }

    @Override
    public double calcXP() {
        return DEFAULT_XP + 20d;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
