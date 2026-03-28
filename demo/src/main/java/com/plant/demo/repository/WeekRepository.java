package com.plant.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.plant.demo.model.Week;

public interface WeekRepository extends JpaRepository<Week, Long> {
}