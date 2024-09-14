package com.email.sender.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.email.sender.entity.Email;
import com.email.sender.service.EmailService;

@RestController
public class EmailController {

	    @Autowired
		private EmailService emailService;
	    
	    @PostMapping("/send-mail")
	    public ResponseEntity<String> sendEmail(@RequestBody Email mail){
	    	
	    	
	    	
	    	emailService.sendSimpleEmail(mail);
	    	return new ResponseEntity<String>("Email Sended",HttpStatus.OK) ;
	    }
}
