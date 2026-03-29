package com.plant.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.plant.demo.model.Week;
import com.plant.demo.service.TaskService;
import com.plant.demo.service.WeekService;

@RestController
@RequestMapping("/api")
public class WeekTaskController {

    private final WeekService weekService;
    private final TaskService taskService;

    public WeekTaskController(WeekService weekService, TaskService taskService) {
        this.weekService = weekService;
        this.taskService = taskService;
    }

    //Weeks
    @GetMapping("/weeks")
    public List<Week> getAllWeeks() { 
        return weekService.getAllWeeks(); 
    }

    @GetMapping("/weeks/{id}")
    public Week getWeekById(@PathVariable Long id) {
        return weekService.getWeekById(id).orElseThrow(() -> new RuntimeException("Week not found with id " + id));
    }

    @PostMapping("/weeks")
    public Week createWeek(@RequestBody Week week) { 
        return weekService.createWeek(week); 
    }

    @PutMapping("/weeks/{id}")
    public Week updateWeek(@PathVariable Long id, @RequestBody Week week) {
        return weekService.updateWeek(id, week);
    }

    @DeleteMapping("/weeks/{id}")
    public void deleteWeek(@PathVariable Long id) { 
        weekService.deleteWeek(id); 
    }

    @GetMapping("/weeks/{id}/tasks")
    public List<com.plant.demo.model.Task> getTasksForWeek(@PathVariable Long id) {
        return weekService.getTasksForWeek(id);
    }

    //Tasks
    @GetMapping("/tasks")
    public List<com.plant.demo.model.Task> getAllTasks() { 
        return taskService.getAllTasks(); 
    }

    @GetMapping("/tasks/{id}")
    public com.plant.demo.model.Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id).orElseThrow(() -> new RuntimeException("Task not found with id " + id));
    }

    @PostMapping("/weeks/{weekId}/tasks")
    public com.plant.demo.model.Task createTask(@PathVariable Long weekId, @RequestBody com.plant.demo.model.Task task) {
        return taskService.createTask(task, weekId);
    }

    @PutMapping("/tasks/{id}")
    public com.plant.demo.model.Task updateTask(@PathVariable Long id, @RequestBody com.plant.demo.model.Task task) {
        return taskService.updateTask(id, task);
    }

    @DeleteMapping("/tasks/{id}")
    public void deleteTask(@PathVariable Long id) { taskService.deleteTask(id); }
}