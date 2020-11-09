package com.neha.uniqueEmailAddresses.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.neha.uniqueEmailAddresses.model.EmailCountOutput;
import com.neha.uniqueEmailAddresses.model.UserEmailInput;
import com.neha.uniqueEmailAddresses.service.UniqueEmailIdentifierService;

/*This controller class will control data flow from model and service classes */


@RestController
public class HttpController {
	
	@Autowired
	private UniqueEmailIdentifierService uniqueEmailIdentifierService;
	
	@PostMapping("/emailCount")
	@ResponseStatus(HttpStatus.OK)
	public EmailCountOutput emailCount(@RequestBody UserEmailInput newEmail)throws Exception {
		
		EmailCountOutput response = uniqueEmailIdentifierService.validateUniqueEmails(newEmail.getUserEmailInput());
		return response;
		
	}

}
