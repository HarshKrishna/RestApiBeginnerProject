package com.hk.rest.webservices.common;

import java.util.UUID;

import org.springframework.stereotype.Service;

@Service
public class Utility {

	public String generateUserId() {

		String userID = UUID.randomUUID().toString();
		return userID;
	}

}
