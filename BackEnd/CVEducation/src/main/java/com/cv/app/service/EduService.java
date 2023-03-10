package com.cv.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.pojo.Education;
import com.cv.app.repository.EduRepository;

@Service
public class EduService {
	
	@Autowired
	EduRepository eduRepo;
	
	public List<Education> getEdu(){
		return (List<Education>) eduRepo.findAll();
	}
	
	public void addEdu(Education edu) {
		this.eduRepo.save(edu);
	}
	
	public void deleteEdu(int id) {
		this.eduRepo.deleteById(id);
	}

}
