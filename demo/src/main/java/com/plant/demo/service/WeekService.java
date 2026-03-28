package com.plant.demo.service;

import org.springframework.stereotype.Service;
import com.plant.demo.model.Week;
import com.plant.demo.repository.WeekRepository;
import java.util.List;
import java.util.Optional;

@Service
public class WeekService {

    private final WeekRepository weekRepository;

    public WeekService(WeekRepository weekRepository) {
        this.weekRepository = weekRepository;
    }

    public List<Week> getAllWeeks() { 
        return weekRepository.findAll(); 
    }

    public Optional<Week> getWeekById(Long id) { 
        return weekRepository.findById(id); 
    }

    public Week createWeek(Week week) { 
        return weekRepository.save(week); 
    }

    public Week updateWeek(Long id, Week weekDetails) {
        Week week = weekRepository.findById(id).orElseThrow(() -> new RuntimeException("Week not found with id " + id));

        week.setWeekNumber(weekDetails.getWeekNumber());
        week.setStartDate(weekDetails.getStartDate());
        week.setEndDate(weekDetails.getEndDate());
        return weekRepository.save(week);
    }

    public void deleteWeek(Long id) {
        weekRepository.deleteById(id); 
    }

    public List<com.plant.demo.model.Task> getTasksForWeek(Long weekId) {
        Week week = weekRepository.findById(weekId)
                .orElseThrow(() -> new RuntimeException("Week not found with id " + weekId));
        return week.getTasks();
    }
}