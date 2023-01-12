package com.cv.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.model.Front;
import com.cv.app.repository.FrontRepository;

@Service
public class FrontService {
	
	@Autowired
	FrontRepository frontRepo;
	
	public List<Front> getFront(){
		return frontRepo.findAll();
	}
	
	public void addFront(Front front) {
		this.frontRepo.save(front);
	}
	
	public void updateFront(int id, Front front) {
		frontRepo.deleteById(id);
		front.setId(id);
		this.frontRepo.save(front);
	}

}
