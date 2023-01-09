package com.cv.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.model.Skills;

public interface SkillRepository extends JpaRepository<Skills, Integer> {

}
