package com.hk.rest.webservices.ui.model.request;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class UpdateUserDetailModel {

	@NotNull(message = "First Name cannot be null")
	private String firstName;
	@NotNull(message = "Last Name cannot be null")
	private String lastName;
	@Email
	private String email;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
