package com.plant.demo.controller;

import org.springframework.web.bind.annotation.*;
import com.plant.demo.model.Week;
import com.plant.demo.service.WeekService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/weeks")
public class WeekController {

    private final WeekService weekService;

    public WeekController(WeekService weekService) {
        this.weekService = weekService;
    }

    @GetMapping
    public List<Week> getAllWeeks() {
        return weekService.getAllWeeks();
    }

    @GetMapping("/{id}")
    public Optional<Week> getWeekById(@PathVariable Long id) {
        return weekService.getWeekById(id);
    }

    @PostMapping
    public Week createWeek(@RequestBody Week week) {
        return weekService.createWeek(week);
    }

    @PutMapping("/{id}")
    public Week updateWeek(@PathVariable Long id, @RequestBody Week week) {
        return weekService.updateWeek(id, week);
    }

    @DeleteMapping("/{id}")
    public void deleteWeek(@PathVariable Long id) {
        weekService.deleteWeek(id);
    }
}