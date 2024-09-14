package com.email.sender.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.email.sender.entity.Email;

import jakarta.validation.constraints.Pattern;

@Service
public class EmailService {

	@Autowired
	private JavaMailSender emailSender;

	public void sendSimpleEmail(Email mail) {
		
		if(mail.getEmail()==null || mail.getEmail().isEmpty()) {
			 throw new IllegalArgumentException("Email address cannot be null or empty");
		}
		
		SimpleMailMessage message=new SimpleMailMessage();
		
		message.setFrom("pratapajay8859@gmail.com");
		message.setTo(mail.getEmail());
		message.setSubject(mail.getSubject());
		message.setText(mail.getBody());
		
		emailSender.send(message);
		
	}

	
	
}
