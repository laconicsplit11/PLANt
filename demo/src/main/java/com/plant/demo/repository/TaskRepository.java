package com.plant.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plant.demo.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {
}