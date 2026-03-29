package com.plant.demo.service;

import org.springframework.stereotype.Service;
import com.plant.demo.model.Week;
import com.plant.demo.model.Task;
import com.plant.demo.repository.WeekRepository;
import java.util.List;
import java.util.Optional;

@Service
public class WeekService {

    private final WeekRepository weekRepository;
    private final TaskService taskService;

    public WeekService(WeekRepository weekRepository, TaskService taskService) {
        this.weekRepository = weekRepository;
        this.taskService = taskService;
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

    public List<Task> getTasksForWeek(Long weekId) {
    if (!weekRepository.existsById(weekId)) {
        throw new RuntimeException("Week not found with id " + weekId);
    }

    return taskService.getTasksByWeekSorted(weekId);
}
}