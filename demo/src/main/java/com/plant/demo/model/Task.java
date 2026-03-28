package com.plant.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String taskName;
    private String taskBody;
    private String dayOfTask;
    private LocalDate dateOfTask;
    private LocalTime timeOfTask;

    @ManyToOne
    @JoinColumn(name = "week_id")
    private Week week;

    public Long getTaskId() {
        return this.id;
    }

    public void setTaskId(Long id) {
        this.id = id;
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
