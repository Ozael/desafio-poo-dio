package com.ozael.domain;

import java.time.LocalDate;

public class Course extends Content {

    private Integer workload;

    public Course(Integer workload) {
        this.workload = workload;
    }

    @Override
    public double calcXP() {
        return DEFAULT_XP * workload;
    }

    public Integer getWorkload() {
        return workload;
    }

    public void setWorkload(Integer workload) {
        this.workload = workload;
    }

}
