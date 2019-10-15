package com.hcl.security.service;

import com.hcl.security.dto.ResponseDto;
import com.hcl.security.dto.UserDto;

public interface UserService {

	ResponseDto registerUser(UserDto userDto);

}
