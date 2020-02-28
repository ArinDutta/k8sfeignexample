package com.example.k8sfeignexample.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.k8sfeignexample.rest.proxy.HelloClientProxy;

@RestController
public class HelloController {
    
	@Autowired
	private HelloClientProxy clientProxy; 
	
	@GetMapping("/message/fetch")
	public ResponseEntity<String> getMessage() {
		return new ResponseEntity<>(clientProxy.getMessage(),HttpStatus.OK);
	}
	
	@GetMapping("/")
	public ResponseEntity info(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
