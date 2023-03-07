package com.ozael.domain;

import java.time.LocalDate;

public class Course extends Content {

    private int workload;

    @Override
    public double calcXP() {
        return DEFAULT_XP * workload;
    }

    public int getWorkload() {
        return workload;
    }

    public void setWorkload(int workload) {
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Curso: " + getTitle() +
                " - Descrição: " + getDescription() +
                " - Carga Horária: " + workload;
    }
}
