package com.email.sender.entity;

public class Email {

	
	@jakarta.validation.constraints.Email(message ="Email should be valid")
	private String email;
	
	private String subject;
	
	private String body;

	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	
}
