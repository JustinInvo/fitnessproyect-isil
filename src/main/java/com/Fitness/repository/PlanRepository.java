package com.Fitness.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Fitness.entity.Plan;



@Repository
public interface PlanRepository extends JpaRepository<Plan, Integer> {
	
}