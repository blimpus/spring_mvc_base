package com.pluralsight.repository;

import java.util.List;

import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

@Transactional
public interface GoalRepository {
	
	@Transactional
	Goal save(Goal goal);

	List<Goal> loadAll();

	List<GoalReport> findAllGoalReports();

}
