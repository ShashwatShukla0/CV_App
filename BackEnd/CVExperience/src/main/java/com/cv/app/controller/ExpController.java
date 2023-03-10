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

import com.cv.app.model.Experience;
import com.cv.app.service.ExpService;

import jakarta.validation.Valid;

@RestController
public class ExpController {
	
	@Autowired
	ExpService expServ;
	
	@GetMapping("/exp")
	public List<Experience> getExp(){
		return expServ.getExp();
	}
	
	@PostMapping("/exp/add")
	public ResponseEntity<?> addExp(@Valid @RequestBody Experience exp){
		expServ.addExp(exp);
		return new ResponseEntity<Experience>(exp,HttpStatus.OK);
	}
	
	@DeleteMapping("exp/{id}")
	public ResponseEntity<?> deleteExp(@PathVariable("id") int id){
		expServ.deleteExp(id);
		return new ResponseEntity<>("Successfully delete: "+id,HttpStatus.OK);
	}

}
