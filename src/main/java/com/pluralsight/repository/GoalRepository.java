package com.pluralsight.repository;

import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;

@Transactional
public interface GoalRepository {
	
	@Transactional
	Goal save(Goal goal);

}
