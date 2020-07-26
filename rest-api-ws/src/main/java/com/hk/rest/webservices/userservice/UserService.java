package com.hk.rest.webservices.userservice;

import com.hk.rest.webservices.ui.model.request.UserDetailsRequest;
import com.hk.rest.webservices.ui.model.response.UserRest;

public interface UserService {
	UserRest createUser(UserDetailsRequest userDetail);
}
