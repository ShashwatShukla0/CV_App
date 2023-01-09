package com.cv.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cv.app.pojo.Education;

import com.cv.app.service.EduService;

import jakarta.validation.Valid;

@RestController
public class EduController {
	
	@Autowired
	EduService eduServ;
	
	@GetMapping("/details")
	public List<Education> getEdu() {
		return eduServ.getEdu();
	}
	
	@PostMapping("/details/add")
	public ResponseEntity<?> addEdu(@Valid @RequestBody Education edu) {
		eduServ.addEdu(edu);
		return new ResponseEntity<Education>(edu,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/details/{id}")
	public ResponseEntity<?> deleteEdu(@PathVariable("id") int id){
		eduServ.deleteEdu(id);
		return new ResponseEntity<>("Successfully deleted "+id, HttpStatus.OK);
	}
	

}
