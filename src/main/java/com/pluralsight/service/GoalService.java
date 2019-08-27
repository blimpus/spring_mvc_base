package com.pluralsight.service;

import org.springframework.transaction.annotation.Transactional;

import com.pluralsight.model.Goal;

@Transactional
public interface GoalService {
	
	@Transactional
	Goal save(Goal goal);

}
