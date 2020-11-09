package com.neha.uniqueEmailAddresses.model;

import java.util.List;

/*This model class will take list of user emails */

public class UserEmailInput {

	List<String> userEmailInput;

	public List<String> getUserEmailInput() {
		return userEmailInput;
	}

	public void setUserEmailInput(List<String> userEmailInput) {
		this.userEmailInput = userEmailInput;
	}
	
	
}
