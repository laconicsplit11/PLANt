package com.plant.demo.service;

import org.springframework.stereotype.Service;
import com.plant.demo.model.Task;
import com.plant.demo.model.Week;
import com.plant.demo.repository.TaskRepository;
import com.plant.demo.repository.WeekRepository;

import java.util.Optional;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository taskRepository;
    private final WeekRepository weekRepository;

    public TaskService(TaskRepository taskRepository, WeekRepository weekRepository) {
        this.taskRepository = taskRepository;
        this.weekRepository = weekRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll(); 
    }

    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id); 
    }

    public List<Task> getTasksByWeekSorted(Long weekId) {
        return taskRepository.findByWeekIdOrderByTimeOfTaskAsc(weekId);
    }

    public Task createTask(Task task, Long weekId) {
        Week week = weekRepository.findById(weekId).orElseThrow(() -> new RuntimeException("Week not found with id " + weekId));
        task.setWeek(week);
        return taskRepository.save(task);
    }

    public Task updateTask(Long id, Task taskDetails) {
        Task task = taskRepository.findById(id).orElseThrow(() -> new RuntimeException("Task not found with id " + id));

        task.setTaskName(taskDetails.getTaskName());
        task.setTaskBody(taskDetails.getTaskBody());
        task.setDayOfTask(taskDetails.getDayOfTask());
        task.setDateOfTask(taskDetails.getDateOfTask());
        task.setTimeOfTask(taskDetails.getTimeOfTask());
        task.setEndTimeOfTask(taskDetails.getEndTimeOfTask());

        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id); 
    }
}