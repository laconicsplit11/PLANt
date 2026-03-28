package com.plant.demo.model;

import java.time.LocalDate;

public class Week {
    long Id;
    int weekNumber;
    LocalDate startDate;
    LocalDate endDate;

    public long getTaskId() {
        return this.Id;
    }

    public void setTaskId(long Id) {
        this.Id = Id;
    }

    public int getWeekNumber() {
        return this.weekNumber;
    }

    public LocalDate getStartDate() {
        return this.startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return this.endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}
