package com.cv.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.cv.app.model.Front;
import com.cv.app.service.FrontService;

@RestController
public class FrontController {
	
	@Autowired
	FrontService frontServ;
	
	@GetMapping("/front")
	public List<Front> getFront(){
		return frontServ.getFront();
	}
	
	@PostMapping("/front/add")
	public ResponseEntity<?> addFront(@RequestBody Front front) {
		frontServ.addFront(front);
		return new ResponseEntity<Front>(front,HttpStatus.OK);
	}
	
	@PatchMapping("/front/{id}")
	public ResponseEntity<?> addFront(@PathVariable int id,@RequestBody Front front) {
		frontServ.updateFront(id,front);
		return new ResponseEntity<Front>(front,HttpStatus.OK);
	}
	
	@GetMapping("/front/edu")
	public String getEdu() {
		String uri= "http://localhost:8080/details";
		RestTemplate restTemp = new RestTemplate();
		String res = restTemp.getForObject(uri, String.class);
		return res;
	}
	
	@GetMapping("/front/exe")
	public String getExe() {
		String uri= "http://localhost:8081/exp";
		RestTemplate restTemp = new RestTemplate();
		String res = restTemp.getForObject(uri, String.class);
		return res;
	}
	
	@GetMapping("/front/skill")
	public String getSkill() {
		String uri= "http://localhost:8082/skills";
		RestTemplate restTemp = new RestTemplate();
		String res = restTemp.getForObject(uri, String.class);
		return res;
	}
	

}
