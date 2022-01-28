package com.safety.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.safety.Model.Action;
import com.safety.Service.ActionService;


@RestController
public class ActionRestController {

	
	@Autowired
	ActionService service;
	
	@PostMapping("/action")
	public ResponseEntity<Action> createAction(@Validated @RequestBody Action actions){
		
		Action aa = service.addAction(actions);
		System.out.println(aa);
		return new ResponseEntity<Action>(aa,HttpStatus.OK);
	}
}
