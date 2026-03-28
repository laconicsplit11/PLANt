package com.plant.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Task {
    private long Id;
    private String taskName;
    private String taskBody;
    private String dayOfTask;
    private LocalDate dateOfTask;
    private LocalTime timeOfTask;

    public long getTaskId() {
        return this.Id;
    }

    public void setTaskId(long Id) {
        this.Id = Id;
    }

    public String getTaskName() {
        return this.taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskBody() {
        return this.taskBody;
    }

    public void setTaskBody(String taskBody) {
        this.taskBody = taskBody;
    }

    public String getDayOfTask() {
        return this.dayOfTask;
    }

    public void setDayOfTask(String dayOfTask) {
        this.dayOfTask = dayOfTask;
    }

    public LocalDate getDateOfTask() {
        return this.dateOfTask;
    }

    public void setDateOfTask(LocalDate dateOfTask) {
        this.dateOfTask = dateOfTask;
    }

    public LocalTime getTimeOfTask() {
        return this.timeOfTask;
    }

    public void setTimeOfTask(LocalTime timeOfTask) {
        this.timeOfTask = timeOfTask;
    }

}
