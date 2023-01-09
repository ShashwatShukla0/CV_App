package com.cv.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cv.app.model.Experience;

public interface ExpRepository extends JpaRepository<Experience, Integer> {

}
