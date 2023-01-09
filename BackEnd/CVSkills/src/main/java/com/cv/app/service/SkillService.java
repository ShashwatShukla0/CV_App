package com.cv.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cv.app.model.Skills;
import com.cv.app.repository.SkillRepository;

@Service
public class SkillService {
	
	@Autowired
	SkillRepository skillRepo;
	
	public List<Skills> getSkill(){
		return(List<Skills>) skillRepo.findAll();
	}
	
	public void addSkill(Skills sk) {
		this.skillRepo.save(sk);
	}
	
	public void deleteSkill(int id) {
		this.skillRepo.deleteById(id);
	}

}
