package com.cv.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cv.app.model.Skills;
import com.cv.app.service.SkillService;

import jakarta.validation.Valid;

@RestController
public class SkillController {
	
	@Autowired
	SkillService skillServ;
	
	@GetMapping("/skills")
	public List<Skills> getSkill(){
		return skillServ.getSkill();
	}
	
	@PostMapping("/skills/add")
	public ResponseEntity<?> addSkill(@Valid @RequestBody Skills sk){
		skillServ.addSkill(sk);
		return new ResponseEntity<Skills>(sk,HttpStatus.OK);
	}
	
	@DeleteMapping("/skills/{id}") 
	public ResponseEntity<?> deleteSkill(@PathVariable int id){
		skillServ.deleteSkill(id);
		return new ResponseEntity<>("Successfully deleted: "+id,HttpStatus.OK);
	}
	

}
