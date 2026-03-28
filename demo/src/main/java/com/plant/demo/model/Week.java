package com.plant.demo.model;

import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "weeks")
public class Week {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int weekNumber;
    private LocalDate startDate;
    private LocalDate endDate;

    @OneToMany(mappedBy = "week", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Task> tasks;

    public Week() {

    }
    
    public Week(int weekNumber, LocalDate startDate, LocalDate endDate) {
        this.weekNumber = weekNumber;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Long getWeekId() {
        return this.id;
    }

    public void setWeekId(Long id) {
        this.id = id;
    }

    public int getWeekNumber() {
        return this.weekNumber;
    }

    public void setWeekNumber(int weekNumber) {
        this.weekNumber = weekNumber;
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
