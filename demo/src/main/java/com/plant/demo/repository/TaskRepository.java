package com.plant.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plant.demo.model.Task;
import java.util.List;

public interface TaskRepository extends JpaRepository<Task, Long> {
    List<Task> findByWeekIdOrderByTimeOfTaskAsc(Long weekId);
}