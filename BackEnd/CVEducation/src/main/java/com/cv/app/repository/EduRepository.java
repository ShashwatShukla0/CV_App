package com.cv.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.pojo.Education;

public interface EduRepository extends JpaRepository<Education, Integer> {

}
