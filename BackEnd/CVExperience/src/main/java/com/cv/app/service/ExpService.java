package com.cv.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.model.Experience;
import com.cv.app.repository.ExpRepository;

@Service
public class ExpService {
	
	@Autowired
	ExpRepository expRepo;
	
	public List<Experience> getExp(){
		return(List<Experience>) expRepo.findAll();
	}
	
	public void addExp(Experience exp) {
		
		this.expRepo.save(exp);
	}
	
	public void deleteExp(int id) {
		this.expRepo.deleteById(id);
	}
}
