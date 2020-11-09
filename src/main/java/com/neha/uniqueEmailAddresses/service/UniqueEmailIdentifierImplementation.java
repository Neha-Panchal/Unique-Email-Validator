package com.neha.uniqueEmailAddresses.service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.neha.uniqueEmailAddresses.model.EmailCountOutput;

@Service
public class UniqueEmailIdentifierImplementation implements UniqueEmailIdentifierService{
	
		public EmailCountOutput validateUniqueEmails(List<String> userEmailInput) {	
			
		 Set<String> uniqueEmailSet = new HashSet<String>();
		 for (String email : userEmailInput) {
		      
			 int index = email.indexOf('@');
		      String emailUsername = email.substring(0, index);
		      String emailDomain = email.substring(index);
		      if (emailUsername.contains("+")) {
		    	  emailUsername = emailUsername.substring(0, emailUsername.indexOf('+'));
		      }
		      // Note: one should escape the specific character '.',
		      // since it is treated as a regex expression.
		      emailUsername = emailUsername.replaceAll("\\.", "");
		      uniqueEmailSet.add(emailUsername + emailDomain);
		    }
		 	EmailCountOutput emailCountOutput=new EmailCountOutput();
		 	emailCountOutput.setUniqueEmailCount(uniqueEmailSet.size());
		    return emailCountOutput;
		  }		
	}


